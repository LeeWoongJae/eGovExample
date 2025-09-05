package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
	public List<Customer> findByNameLike(String name);
	
	@Query("select u from Customer u where u.phone like %?1% order by name desc")
	public List<Customer> findByPhone(String phone);
	
	
}
