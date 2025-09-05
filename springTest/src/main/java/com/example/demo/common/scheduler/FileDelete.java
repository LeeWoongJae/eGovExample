package com.example.demo.common.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FileDelete {
	
	@Scheduled(fixedRate = 3000)
	public void print() {
		System.out.println("파일이 삭제되는 연습용 로그");
	}
}
