package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpVO;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpMapperTest {
	@Autowired
	EmpMapper empMapper;
	
	
	@DisplayName("전체조회")
	//@Test
	public void selectEmp() {
		EmpVO vo = new EmpVO();
		vo.setDepartmentId(50L);
		vo.setFirstName("peter");
		vo.setPrevPage(1);
		vo.setNextPage(10);
		List<EmpVO> list = empMapper.selectEmp(vo); 
		list.forEach(emp -> System.out.println(emp));
	}
	
	@DisplayName("단건조회")
	@Test
	public void selectEmpById() {
		EmpVO empVo = empMapper.selectEmpById(100L);
		log.warn("employees : "+empVo.getDvo().getDepartmentName());
	}
	@DisplayName("사원등록")
	//@Test
	public void insertEmployee() {
		EmpVO empVO = EmpVO.builder().employeeId(400L).lastName("John").firstName("CENA").hireDate(new Date()).email("aaa.aa").jobId("IT_PROG").build();
		int result = empMapper.insertEmployee(empVO);
		System.out.println(result+" 건 등록완료!");
	}
	
}