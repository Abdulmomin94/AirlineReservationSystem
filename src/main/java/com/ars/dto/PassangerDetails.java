package com.ars.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.ars.entity.Passenger;

public class PassangerDetails {
	@NotEmpty(message = "Passenger List cannot be empty for booking!")
	List<Passenger> passengerList;

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void PassengerDeatils() {
		
	}

	public void PassengerDetails(List<Passenger> passengerList) {
		
		this.passengerList = passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "PassengerDetails [passengerList=" + passengerList + "]";
	}

}
