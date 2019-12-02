package com.store.model.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.store.model.entity.Customer;
import com.store.model.service.CustomerService;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;


@Service
public class DetailService implements UserDetailsService {
	@Autowired
	private CustomerService customerService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	Customer customer= customerService.findByEmail(email);
	if(customer==null)
	throw new CustomerNotFoundException();
		return new User(customer.getEmail(),customer.getPassword(), null);
	}

}
