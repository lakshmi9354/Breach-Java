package com.ing.breachmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.TicketShowDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.repository.BreachTicketRepository;

@Service
public class BreachTicketService {

	@Autowired
	BreachTicketRepository breachTicket;
	
	public TicketShowDto getReopenTicket(int ticketId)
	{
		Breach breach = new Breach();
		TicketShowDto ticketShow = new TicketShowDto();
		Optional<Breach> breachData = breachTicket.findByticketNumber(ticketId);
		if (breachData.isPresent()) {
			breach.setBreachStatus("Opened");
			breach.setBreachId(breachData.get().getBreachId());
			breachTicket.save(breach);
			ticketShow.setTicketId(breachData.get().getBreachId());			
		}
		return ticketShow;
	}
	
}
