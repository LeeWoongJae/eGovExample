package com.example.demo.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class MemberService {
	
	
	final MemberMapper memberMapper;
	
	public void print() {
		System.out.println(memberMapper+" service called");
	}
	
	
	
}
