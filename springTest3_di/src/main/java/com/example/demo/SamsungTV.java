package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.di.Speaker;

@Lazy // 지연로딩 (서버시작시간을 줄여준다 , 사용빈도가적음)
@Scope("singleton") // 사용빈도 적음
@Component
//@AllArgsConstructor
public class SamsungTV implements TV {

	
   //@Autowired 
	Speaker spk;
	
	// Refactor > Extract interface (TV인터페이스를 Extract 한 클래스 기준으로 생성하고 자동으로 Override)
	@Override
	public void powerOn() {
		System.out.println("삼성 TV--전원 on");
	}
	@Override
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
	}
	@Override
	public void volumeUp() {
		spk.volumeUp();
	}
	@Override
	public void volumeDown() {
		spk.volumeDown();
	}
}