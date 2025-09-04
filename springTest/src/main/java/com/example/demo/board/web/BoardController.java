package com.example.demo.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/board")
@RequiredArgsConstructor
@Controller
public class BoardController {

	// @Autowired BoardMapper boardMapper;
	final BoardService boardService;  //  == @Autowired BoardService boardService; 
	
	// 단건조회
	@GetMapping("/board")
	public String board(@RequestParam Long bno , Model model) {
		model.addAttribute("board" , boardService.selectBoard(bno));
		return "board";
	}
	
	// 전체조회
	@GetMapping("/boardList")
	public String boardList(Model model) {
		model.addAttribute("boardList",boardService.selectAll());
		return "boardList";
	}
	
	// 댓글목록
	@GetMapping("/reply")
	public String replyList(Model model , @RequestParam("bno") Long bno) {
		
		model.addAttribute("reply",boardService.reply(bno));
		return "reply";
	}
	
	
}
