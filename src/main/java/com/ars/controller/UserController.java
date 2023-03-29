package com.ars.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ars.dto.LoginDetails;
import com.ars.entity.Customer;
import com.ars.exception.ARSystServiceException;
import com.ars.service.LoginService;
import com.ars.service.ResistrationService;

public class UserController {
	@Autowired
	LoginService loginService;

	@Autowired
	ResistrationService registrationService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> Validate(@Valid @RequestBody LoginDetails login) throws ARSystServiceException {
		Boolean result = false;
		result = loginService.isUserValid(login);
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<Boolean> customer(@RequestBody Customer customer) throws ARSystServiceException {
		Boolean result = registrationService.insertUser(customer);
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}

}
