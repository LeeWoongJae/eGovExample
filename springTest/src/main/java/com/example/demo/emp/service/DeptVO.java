package com.example.demo.emp.service;

import lombok.Data;

@Data
public class DeptVO {
	private Long departmentId;
	private String departmentName;
	private Long managerId;
	private String locationId;
}
