package com.example.demo.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBeforeAdvice {
	
	@Pointcut("execution(* com.example..*Impl.*(..))")
	public void allPointCut() {}
	
	@Before("allPointCut()")
	public void print() {
		System.out.println("LogBeforeAdvice class called");
	}
}
