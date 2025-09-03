package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SpringTest2ApplicationTests.class)
class SpringTest2ApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void testList() throws Exception {
//	 UserVO user = new UserVO();
//	 user.setName("김첨지");
//	 user.setAge(20);
//	 String jsonStr = new ObjectMapper().writeValueAsString(user);
		String result = mockMvc
				 .perform( get("/api/rest1")
				 //.param("name","김길통")
				 //.param("age",1)
				)
				 .andExpect(status().isOk())
				 .andReturn().getResponse().getContentAsString();
		System.out.println(result.length());
	}
}