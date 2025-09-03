package com.example.demo.board.service;

import java.util.List;

public interface BoardService {
	
	List<BoardVO> selectAll(); // 전체조회
	List<ReplyVO> reply(Long bno); // 댓글조회
	BoardVO selectBoard(Long bno); // 단건조회
	
	
}
