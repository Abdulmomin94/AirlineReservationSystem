package com.ars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ars.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}