package com.ars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ars.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Double> {

}


