package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.common.Paging;
import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.service.EmpVO;

@RequestMapping("/emp")
@Controller
public class EmpController {
	
	//@Autowired EmpMapper empMapper;
	@Autowired EmpService empService;
	
//	@GetMapping("empList")
//	public String empList(Model model) {
//		EmpVO vo = new EmpVO();
//		vo.setDepartmentId(50L);
//		vo.setPrevPage(1);
//		vo.setNextPage(10);
//		model.addAttribute("empList" , empMapper.selectEmp(vo));
//		return "empList";  // empList.html
//	}
	@GetMapping("/empList") // empList?paging=2
	public String empList(Model model, EmpVO empVo , Paging paging) {
		paging.setTotalRecord(empService.empCount(empVo));
		paging.setPageUnit(5); // 페이지당 5개 데이터만
		empVo.setPrevPage(paging.getFirst());
		empVo.setNextPage(paging.getLast());
		
		model.addAttribute("empList" , empService.selectEmp(empVo));
		return "emp/empList";  // empList.html
	}
	
	@GetMapping("/emp")
	public String emp(Model model , @RequestParam("employeeId") Long employeeId) {
		model.addAttribute("emp" , empService.selectEmpById(employeeId));
		return "emp/emp";
	}
	
	
}
