package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.security.mapper.UserMapper;
import com.example.demo.security.service.UserDTO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class UserMapperTest {
	
	@Autowired UserMapper userMapper;
	
	@Test
	public void getUserTest() {
		UserDTO user = userMapper.getUser("user");
		log.info(user);
	}
}
