package com.example.demo.emp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.service.EmpVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service // == Service
public class EmpServiceImpl implements EmpService {

	final EmpMapper empMapper; // @RequiredArgsContructor + final ~ == @Autowired == @Setter(@Method_={@Autowired})

	@Override
	public List<EmpVO> selectEmp(EmpVO vo) {
		return empMapper.selectEmp(vo);
	}

	@Override
	public EmpVO selectEmpById(Long employeeId) {
		return empMapper.selectEmpById(employeeId);
	}

	@Override
	public int insertEmployee(EmpVO vo) {
		return empMapper.insertEmployee(vo);
	}

	@Override
	public Long empCount(EmpVO vo) {
		return empMapper.empCount(vo);
	}
	
	
	
	
	
	
}
