package com.ars.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ars.entity.Ticket;
import com.ars.repository.TicketRepository;

public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public void createTicket(Ticket ticket) {

		ticketRepository.saveAndFlush(ticket);

	}

}
