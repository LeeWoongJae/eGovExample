package com.example.demo.security.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.security.service.RoleDTO;
import com.example.demo.security.service.UserDTO;

@Mapper
public interface UserMapper {
	UserDTO getUser(String loginId);
	List<RoleDTO> getRole(Long id);
}
