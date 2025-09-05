package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;
import com.example.demo.board.service.ReplyVO;
import com.example.demo.common.aop.PrintExecutionTime;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BaordServiceImpl implements BoardService{

	final BoardMapper boardMapper;
	
	
	@Override
	public List<BoardVO> selectAll() {

		return boardMapper.selectAll();
	}

	@Override
	public List<ReplyVO> reply(Long bno) {
		return boardMapper.reply(bno);
	}

	@Override
	@PrintExecutionTime
	public BoardVO selectBoard(Long bno) {
		return boardMapper.selectBoard(bno);
	}

	@Override
	public int registBaord(BoardVO board) {
		
		return boardMapper.registBoard(board);
	}

	@Transactional
	@Override
	public int deleteBoard(Long bno) {
		
		
		
		return 0;
	}

}
