package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// Bean 객체를 연결하기위한 Test annotation
@SpringBootTest
public class DiTest {
	// @Component annotation을 넣은 Bean 기준으로 연결 (Bean 주입 = Autowired)
	@Autowired TV tv; 
	@Autowired SampleHotel ht;
	//@Test
	public void test1() {
		// TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
	}
	
	@Test
	public void test2() {
		System.out.println(ht.getChief());
	}
	
	
}
