package com.example.demo.ex2;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.ex1.UserVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Tag(name = "회원관리API" , description = "회원관리컨트롤러")
@Log4j2
@RequestMapping("/api")
@RestController // Controller + ResponseBody
public class Ex2Controller {
	
	@Tag(name = "회원관리API")
	@Operation(summary = "회원조회")
	// UserVO 단건조회
	@GetMapping("/rest1")
	public UserVO rest1() {
		return new UserVO("kildong-hong",20,new Date(),Arrays.asList("독서","검술"));
	}
	
//	@PostMapping("/rest2") // JSON String으로 넘기는 건 GET 방식이 불가 // queryString : URI?name=김길동&age=20&...
//	public UserVO rest2(UserVO userVO) {
//		return userVO;
//	}
	
	@Tag(name = "회원관리API")
	@Operation(summary = "단건조회")
	@GetMapping("/rest2") // JSON String으로 넘기는 건 GET 방식이 불가 // queryString : URI?name=김길동&age=20&...
	public UserVO rest2(UserVO userVO) {
		return userVO;
	}
	
	@PostMapping("/rest3") // jsonString : {"name" : "str" , "age": ...} ==> VO
	public UserVO rest3(@RequestBody UserVO userVO) {
		log.info(userVO);
		return userVO;
	}
	
	@GetMapping("/rest4")
	public Map rest4() {
		//log.info();
		RestTemplate resTempl = new RestTemplate();
		String uri = "https://jsonplaceholder.typicode.com/todos/1";
		return resTempl.getForObject(uri, Map.class);
	}
	
	@GetMapping("/rest5")
	public String getPost() {
		// RestTemplate 보단 WebClient 사용을 권장
		 WebClient webClient = WebClient.create();
		 String response = webClient.get()
		 .uri("https://jsonplaceholder.typicode.com/posts/1")
		 .retrieve()
		 .bodyToMono(String.class).block(); 
		 // .block() 비동기를 동기식으로 처리
		return response;
		}
	
}
