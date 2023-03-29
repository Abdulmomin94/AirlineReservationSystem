package com.ars.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ars.dto.LoginDetails;
import com.ars.entity.Customer;
import com.ars.exception.ExceptionConstants;
import com.ars.exception.ARSystServiceException;
import com.ars.repository.CustomerRepository;

public class LoginService {

	@Autowired
	private CustomerRepository customerRepository;

	public boolean isUserValid(LoginDetails customerLogin) throws ARSystServiceException {

		Customer customer = customerRepository.findById(customerLogin.getUserId()).get();

		if (customer == null) {
			throw new ARSystServiceException(ExceptionConstants.USER_NOT_FOUND.toString(), "User record not found");
		} else if (!(customer.getPassword().equals(customerLogin.getPassword()))) {
			throw new ARSystServiceException(ExceptionConstants.USER_INVALID.toString(), "Invalid credentials");
		}
		return true;

	}

}
