package com.example.demo.board.service;

import java.util.List;

public interface BoardService {
	
	List<BoardVO> selectAll(); // 전체조회
	List<ReplyVO> reply(Long bno); // 댓글조회
	BoardVO selectBoard(Long bno); // 단건조회
	int registBaord(BoardVO board); // 게시글등록
	int deleteBoard(Long bno); // 게시글삭제
}
