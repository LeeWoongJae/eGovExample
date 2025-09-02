package com.example.demo.board.service;

import java.util.Date;

import com.example.demo.common.SearchVO;
import com.example.demo.emp.service.DeptVO;
import com.example.demo.emp.service.EmpVO;

import lombok.Builder;
import lombok.Data;

@Data
public class ReplyVO extends SearchVO{
	private Long rno;
	private Long bno;
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
	

}
