package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.BoardVO;
import com.example.demo.board.service.ReplyVO;

@Mapper
public interface BoardMapper {
	
	List<BoardVO> selectAll(); // 전체조회
	List<ReplyVO> reply(Long bno); // 댓글조회
}
