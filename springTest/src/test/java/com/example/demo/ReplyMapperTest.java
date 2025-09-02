package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyVO;


@SpringBootTest
public class ReplyMapperTest {

	@Autowired ReplyMapper replyMapper;
	
	@DisplayName("등록테스트")
//	@Test
	public void insert() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(1L);
		vo.setReply("TEST");
		vo.setReplyer("TEST001");
		int result = replyMapper.insert(vo);
		assertEquals(result, 1);
	}
	
	@DisplayName("페이징처리")
	@Test
	public void getList() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(1L);
		vo.setPrevPage(1);
		vo.setNextPage(10);
		List<ReplyVO> list = replyMapper.getList(vo);
		list.forEach(System.out::println);
	}
	
	
}
