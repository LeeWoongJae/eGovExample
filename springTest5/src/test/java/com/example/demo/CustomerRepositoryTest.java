package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.Address;
import com.example.demo.domain.Customer;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.CustomerRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired CustomerRepository customerRepository;
	@Autowired AddressRepository addressRepository;
	
	//@Test
	public void test1() {
		List<Customer> list = customerRepository.findAll();
		
//		for(int i=0;i<=list.size();i++) {
//			System.out.println(" USERNAME : "+list.get(i).getName() +", PHONE : "+ list.get(i).getPhone());
//		}
		
		//list.forEach(item -> System.out.println(item.getName() +" , "+ item.getPhone()));
		list.forEach(System.out::println);
	}
	
	//@Test
	public void test2() {
		Customer customer = customerRepository.findById(1L).get();
		System.out.println(customer);
	}
	
	
    //@Test
	public void test3() {
		// 단건조회
		Customer customer = customerRepository.findById(1L).get();
		// 삭제
		//customerRepository.delete(customer);\
		customerRepository.findAll().forEach(System.out::println);
	}
	
	//@Test
	public void test4() {
		Customer customer = new Customer("qwe", "010-2222-3333");
		customerRepository.save(customer);
		customerRepository.findAll().forEach(System.out::println);
	}
	
	//@Test
	public void test5() {
		Customer customer = new Customer("qwe", "010-2222-3333");
		customerRepository.save(customer);
		Customer cuser = customerRepository.findById(6L).get();
		cuser.setName("lee");
		customerRepository.save(cuser);
		customerRepository.findAll().forEach(System.out::println);
	}
	
	//@Test
	public void findName() {
		customerRepository.findByNameLike("%e%").forEach(System.out::println);
	}
	
	//@Test
	public void findPhone() {
		List<Customer> customer = customerRepository.findByPhone("1");
		System.out.println(customer);
	}
	
	@Test
	void onetoOneCustomerOwnerTest()	{
//		given(준비)
	Address	addressEntity =	Address.builder().zipcode("04411").address("대구").build();	
	addressRepository.save(addressEntity);
	Customer	customerentity =	Customer.builder().name("길동").address(addressEntity).build();
	customerRepository.save(customerentity);
	//when(실행)
	Customer	customer	=	customerRepository.findById(1L).get();
	log.info(customer.getName()+":"+customer.getAddress().getZipcode());
	//then(검증)
	assertEquals("04411",	customer.getAddress().getZipcode());
	}
	
}
