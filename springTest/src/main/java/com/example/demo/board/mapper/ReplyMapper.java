package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {
	int insert(ReplyVO repl); // 등록
	int delete(@RequestParam("rno")Long rno); // 삭제
	int update(ReplyVO repl); // 수정
	List<ReplyVO> getList(ReplyVO repl); // 전체조회
	int getCountByBno(@RequestParam("bno")Long bno); // 해당게시글의 댓글수
	ReplyVO read(@RequestParam("rno")Long rno); // 댓글단건조회
	
	
}
