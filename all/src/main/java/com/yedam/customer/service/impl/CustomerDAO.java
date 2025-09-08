package com.yedam.customer.service.impl;

import org.springframework.stereotype.Repository;

import com.yedam.customer.service.CustomerVO;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("customerDAO")
public class CustomerDAO extends EgovComAbstractDAO{
	
	// 단건 조회
	public CustomerVO selectArticleDetail(Long id) {
		return selectOne("CustomerDAO.selectOne",id);
	}
}
