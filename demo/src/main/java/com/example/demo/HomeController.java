package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@Autowired
	Animal animal;
	
	
	
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		// json 타입을 가져오는 ResponseBody
		animal.sound();
		return "hello";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
}
