package com.ars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ars.entity.CreditCardDeatils;

public interface CreditCardRepository extends JpaRepository<CreditCardDeatils, String> {

}
