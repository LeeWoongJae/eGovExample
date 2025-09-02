package com.example.demo.ex1;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RequestMapping("/api")
@Controller
public class Ex1Controller {
	
	@GetMapping("/sample")
	public ModelAndView sample() {
		ModelAndView view = new ModelAndView("sample");
		view.addObject("today",new Date());
		return view;
		
	}
	
	@GetMapping("/main")
	public void main() {}
	
	
	// commandHandler
	@GetMapping("/ex1")
	public String ex1(UserVO userVO , Model model) {
		model.addAttribute("user", userVO);
		log.info(userVO);
		return "sample";
	}
	// index 이용해서 배열 객체로
	@GetMapping("/ex2") // userList[0].name= ... &userList[0].age= 
	public String ex2(UserListVO userList) {
		log.info(userList);
		return "sample";
	}
	// 파라메터를 하나하나 받는게 가능 == request.getParameter();
	@GetMapping("/ex3")  
	public String ex3(@RequestParam(value = "userName") String name , @RequestParam(required = false, defaultValue = "31", value = "userAge") Integer age) {
		log.info("이름 : "+name + ", 나이 : " + age);
		return "sample";
	}
	// Map - 모든 파라메터들을 가져갈수 있다
	@GetMapping("/ex4")
	public String ex4(@RequestParam Map<String , Object> map) {
		log.info(map);
		return "sample";
	}
	
	@GetMapping("/ex5/{name}/{age}")
	public String ex5(@PathVariable String name, @PathVariable int age) {
		log.info(name+" : "+ age);
		return "sample";
	}
	
	@PostMapping("/ex6")
	public String ex6(UserVO userVO , MultipartFile pic) {
		log.info(pic.getOriginalFilename());
		log.info(pic.getSize());
		return "sample";
	}
	
	
	
	
}
