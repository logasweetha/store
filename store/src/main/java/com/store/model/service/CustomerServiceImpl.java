package com.store.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.model.entity.Customer;
import com.store.model.repo.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer findByEmail(String email) {
		
		return customerRepository.findByEmail(email);
	}

	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

}
