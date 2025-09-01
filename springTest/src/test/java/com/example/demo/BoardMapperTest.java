package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardVO;

@SpringBootTest
public class BoardMapperTest {
	@Autowired BoardMapper boardMapper;
	
	
	
	@DisplayName("전체조회")
	@Test
	public void selectAll() {
		List<BoardVO> list = boardMapper.selectAll();
		list.forEach(board -> System.out.println(board));
	}
	
	
	
	
}
