package com.example.demo.emp.service;

import java.util.List;

// use case diagram
public interface EmpService {

	// // 로직 정의 // // 
	
	// 사원 전체 조회
	List<EmpVO>selectEmp(EmpVO vo);
	
	// 사원 단건 조회
	EmpVO selectEmpById(Long employeeId);
	
	// 사원 등록
	int insertEmployee(EmpVO vo);
	
	// 사원 수 조회
	Long empCount(EmpVO vo);
	
}
