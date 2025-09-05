package com.example.demo.board.web;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;
import com.example.demo.common.aop.PrintExecutionTime;

import lombok.RequiredArgsConstructor;

@RequestMapping("/board")
@RequiredArgsConstructor
@Controller
public class BoardController {

	// @Autowired BoardMapper boardMapper;
	final BoardService boardService;  //  == @Autowired BoardService boardService; 
	
	@Value("${file.upload.dir}") // 업로드 파일 경로 지정 - properties
	String UPLOAD_DIR;
	
	// 단건조회
	@GetMapping("/board")
	public String board(@RequestParam Long bno , Model model) {
		model.addAttribute("board" , boardService.selectBoard(bno));
		return "board/board"; // board폴더 하위에 board.html 존재
	}
	
	// 전체조회
	@GetMapping("/boardList")
	public String boardList(Model model) {
		model.addAttribute("boardList",boardService.selectAll());
		return "board/boardList";
	}
	
	// 댓글목록
	@GetMapping("/reply")
	public String replyList(Model model , @RequestParam("bno") Long bno) {
		
		model.addAttribute("reply",boardService.reply(bno));
		return "board/reply";
	}
	
	//
	@GetMapping("/register")
	public String boardRegistPage(BoardVO board) {
		return "board/register";
	}
	
	// 글등록처리
	@PostMapping("/register")
	public String registBoard(BoardVO board, MultipartFile file) throws IllegalStateException, IOException {
		if(!file.isEmpty() && file.getSize() > 0) {
			// 파일이 비어있지 않고 파일 크기가 0보다 크다면
			// file upload
			file.transferTo(new File(UPLOAD_DIR , file.getOriginalFilename()));
			
			
			// filename insert
			board.setAttach(file.getOriginalFilename());
			
		}
		boardService.registBaord(board);
		return "redirect:/board/boardList";
		
	}
	
	
	@GetMapping("/filedown/{filename}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String filename) throws MalformedURLException {
		// 파일 경로 설정
		Path filePath = Paths.get(UPLOAD_DIR).resolve(filename).normalize();

		// 파일을 Resource 로 로드
		Resource resource = new UrlResource(filePath.toUri());
		if (!resource.exists()) {
			return ResponseEntity.notFound().build();
		}

		// Content-Disposition 헤더에 다운로드용 파일명 지정
		String contentDisposition = "attachment; filename=\"" + resource.getFilename() + "\"";

		return ResponseEntity.ok().contentType(MediaType.APPLICATION_OCTET_STREAM) // 이진 파일
				.header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition).body(resource);
	}
	
	
}
