package com.ars.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ars.entity.Customer;
import com.ars.exception.ARSystServiceException;
import com.ars.repository.CustomerRepository;

public class ResistrationService {

	@Autowired
	private CustomerRepository customerRepository;

	public Boolean insertUser(Customer customer) throws ARSystServiceException {

		Customer cust = customerRepository.saveAndFlush(customer);

		if (cust == null) {
			throw new ARSystServiceException("User record not found");
		} else {
			return true;
		}

	}

}
