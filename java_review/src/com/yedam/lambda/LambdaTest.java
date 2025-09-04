package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.yedam.collect.EmpVO;



//class NameComp implements Comparator<EmpVO>{
//
//	@Override
//	public int compare(EmpVO o1, EmpVO o2) {
//		// 
//		return o1.getDept() - o2.getDept();
//	}
//	
//}


public class LambdaTest{
	@Test
	public void test()
	{
		List<EmpVO> list = Arrays.asList(new EmpVO(100,"김춘삼",10),new EmpVO(101,"김길동",30),
				                         new EmpVO(102,"박춘배",50),new EmpVO(103,"최필립",20)
				);
	// list.sort((EmpVO o1, EmpVO o2) -> o2.getEmpNo() - o1.getEmpNo()	);
	list.sort((EmpVO o1, EmpVO o2) -> o2.getEmpName().compareTo( o1.getEmpName() ) );
	System.out.println(list);
	}

}
