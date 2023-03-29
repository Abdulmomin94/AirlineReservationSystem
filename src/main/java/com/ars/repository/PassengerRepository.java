package com.ars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ars.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}

