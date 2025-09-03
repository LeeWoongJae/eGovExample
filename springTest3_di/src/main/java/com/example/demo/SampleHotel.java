package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component // 호출을 하려면 component로 Bean을 등록해서 getter setter 사용
@RequiredArgsConstructor
@Data
public class SampleHotel {

	//@Autowired
	final Chief chief;
	
	
}
