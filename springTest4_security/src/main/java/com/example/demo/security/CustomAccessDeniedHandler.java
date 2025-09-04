package com.example.demo.security;

import java.io.IOException;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse resp,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		// resp.sendRedirect(""); // handler 
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().append("<script>alert('접근오류 : 권한이 없습니다.');"
				                +"location.href='/';"
				                +"</script>");
		
	}
	
	
	
	

}
