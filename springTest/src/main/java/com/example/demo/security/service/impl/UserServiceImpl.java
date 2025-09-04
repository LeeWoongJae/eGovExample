package com.example.demo.security.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.security.mapper.UserMapper;
import com.example.demo.security.service.CustomUserDetail;
import com.example.demo.security.service.UserDTO;
import com.example.demo.security.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService, UserDetailsService{

	final UserMapper userMapper;
	
	
	
	@Override
	public UserDTO getUser(String userId) {
		
		return userMapper.getUser(userId);
		
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDTO user = userMapper.getUser(username);
		if(user == null) {
			throw new UsernameNotFoundException("not found id");
		}
		return new CustomUserDetail(user);
	}

}
