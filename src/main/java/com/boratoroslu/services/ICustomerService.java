package com.boratoroslu.services;

import com.boratoroslu.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);

}
