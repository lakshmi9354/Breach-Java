package com.ing.breachmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.TicketShowDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.repository.BreachTicketRepository;

@Service
public class BreachTicketService {

	@Autowired
	BreachTicketRepository breachTicket;
	
	public TicketShowDto getReopenTicket(Integer ticketId)
	{
		TicketShowDto ticketShow = new TicketShowDto();
		Breach breachData = breachTicket.findByTicketNumber(ticketId);
		if (breachData.getBreachCategory() != null) {
			breachData.setBreachStatus("Opened");
			breachData.setBreachId(breachData.getBreachId());
			breachTicket.save(breachData);
			ticketShow.setTicketId(breachData.getBreachId());	
			ticketShow.setTicketStatus("breach opened successfully");
			ticketShow.setTicketId(breachData.getTicketNumber());
			return ticketShow;
		}else
		{
			ticketShow.setTicketStatus("breach not opened successfully");
			ticketShow.setTicketId(breachData.getTicketNumber());
			return ticketShow;
		}
		
	}

	public TicketShowDto breachAction(Integer ticketNumber) {
		
		
		TicketShowDto ticketShow = new TicketShowDto();
		System.out.println("ticketNumber "+ticketNumber);
		
		Breach breachData = breachTicket.findByTicketNumber(ticketNumber);
		System.out.println("breachTicket "+breachData.getTicketStatus());
		if (breachData.getBreachId()!=0) {
			breachData.setBreachId(breachData.getBreachId());
			breachData.setBreachStatus("Closed");
			breachTicket.save(breachData);
			ticketShow.setTicketStatus("breach closed successfully");
			ticketShow.setTicketId(breachData.getTicketNumber());
			return ticketShow;
		}
		else {
			ticketShow.setTicketStatus("breach not closed successfully");
			ticketShow.setTicketId(breachData.getTicketNumber());
			return ticketShow;
		}
	}
	
}
