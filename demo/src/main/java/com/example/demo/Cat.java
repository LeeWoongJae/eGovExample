package com.example.demo;

import org.springframework.stereotype.Component;

@Component // 싱글톤 패턴으로 생성해서 컨테이너에 담기(AutoWired로인해 클래스 강제연결)
public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("meow");
	}
	

}
