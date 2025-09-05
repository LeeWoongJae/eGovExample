package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
//@EnableScheduling
// 인터페이스가 꼬일수 있어서 스프링용 매퍼 경로를 고정한다
@MapperScan(basePackages = "com.example.demo.**.mapper")
@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
	
	
	


}
