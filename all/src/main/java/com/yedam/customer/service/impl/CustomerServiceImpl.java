package com.yedam.customer.service.impl;

import javax.annotation.Resource;

import com.yedam.customer.service.CustomerService;
import com.yedam.customer.service.CustomerVO;

public class CustomerServiceImpl implements CustomerService{

	@Resource(name="customerDAO") CustomerDAO customerDAO;
	
	@Override
	public CustomerVO selectArticleDetail(Long id) {
		return customerDAO.selectArticleDetail(id);
	}

}
