package com.ars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ars.entity.Passenger;
import com.ars.repository.PassengerRepository;

public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	public void createPassenger(List<Passenger> passengers) {

		passengerRepository.saveAll(passengers);

	}

}
