package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Posts;
import com.example.demo.repository.PostsRepository;

@SpringBootTest
public class PostsRepositoryTest {
	
	@Autowired PostsRepository postsRepository;
	
	
	// 모든 테스트가 종료되면 마지막에 한번 실행
	//@AfterAll
//	public void cleanup() {
//		postsRepository.deleteAll();
//	}
	
	@Transactional
	@Test
	public void insert() {
		
		Posts posts = Posts.builder().author("TEST").title("TESTTILE").content("TESTCONTENTS").build();
		postsRepository.save(posts);
		System.out.println(posts);
	}
	
	
	
}
