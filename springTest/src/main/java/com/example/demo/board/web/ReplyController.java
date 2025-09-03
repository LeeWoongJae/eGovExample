package com.example.demo.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyVO;

@RestController
public class ReplyController {
	
	@Autowired ReplyMapper replyMapper;
	
	// 등록
	@PostMapping("/reply")
	public int insert(@RequestBody ReplyVO vo) {
		int result = replyMapper.insert(vo); 
		return result;
	}
	
	
	// 수정
	@PutMapping("/reply/{rno}")
	public int update(@RequestBody ReplyVO vo, @PathVariable("rno")Long rno) {
		ReplyVO reply = new ReplyVO();
		reply.setRno(rno);
		reply.setReply(vo.getReply());
		int result = replyMapper.update(reply);
		return result;
	}
	
	
	// 삭제
	@DeleteMapping("/reply/{rno}")
	public int delete(@PathVariable("rno")Long rno) {
		int result = replyMapper.delete(rno);
		return result;
	}
	
	// 전체조회
	@GetMapping("/board/{bno}/reply")
	public List<ReplyVO> list(ReplyVO reply , Model model) {
//		reply.setBno(1L);
		reply.setNextPage(10);
		reply.setPrevPage(1);
		List<ReplyVO> list = replyMapper.getList(reply);
		model.addAttribute("reply",list);
		return list;
	}
	
	// 단건조회
	@GetMapping("/reply/{rno}")
	public String get() {
		return "";
	}
	
}
