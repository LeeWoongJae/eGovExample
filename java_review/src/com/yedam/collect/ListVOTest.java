package com.yedam.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListVOTest {
	
	@Test
	public void test2() {
		DeptVO dept1 = DeptVO.builder().dname("init").build();
		DeptVO dept2 = DeptVO.builder().deptno(100).dname("kim").build();
	}
			
	
	
	@Test
	public void test() {
		List<EmpVO> list = new ArrayList<>();
		list.add(new EmpVO(100 , "홍길동", 10));
		list.add(new EmpVO(101 , "홍길순", 30));
		list.add(new EmpVO(102 , "박점멸",50));
		
		for(EmpVO vo : list) {
			System.out.println(vo.getEmpName());
		}
		assertEquals(list.size(),3);
	}
	
	

}
