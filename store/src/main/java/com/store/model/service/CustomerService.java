package com.store.model.service;

import java.util.List;

import com.store.model.entity.Customer;

public interface CustomerService {
	public Customer findByEmail(String email);

	public List<Customer> findAll();
	
	public Customer addCustomer(Customer customer);
}
