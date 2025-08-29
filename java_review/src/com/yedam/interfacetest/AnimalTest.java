package com.yedam.interfacetest;

import org.junit.jupiter.api.Test;
/**
 * 다형성
 * 부모타입 참조변수가 자식객체 참조 가능 -> 실행 결과가 다르게 보여준다
 * 
 */
public class AnimalTest {
	@Test
	public void test() {
//		Cat cat = new Cat();
//		cat.sound();
		Animal animal = new Cat();
		animal.sound();
	}
	
	

}
