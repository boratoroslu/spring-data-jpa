package com.boratoroslu.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boratoroslu.dto.DtoCustomer;
import com.boratoroslu.entities.Customer;
import com.boratoroslu.repository.CustomerRepository;
import com.boratoroslu.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	@Override
	public DtoCustomer findCustomerById(Long id) {
	Optional<Customer> optional =	customerRepository.findById(id);
		return null;
	}

}
