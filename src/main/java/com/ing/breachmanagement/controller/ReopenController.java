package com.ing.breachmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.TicketShowDto;
import com.ing.breachmanagement.service.BreachTicketService;

@RestController
@CrossOrigin(allowedHeaders = {"*","/"}, origins = {"*","/"})
public class ReopenController {
	
	@Autowired
	BreachTicketService breachTicketService;
	@PutMapping("/reopenTicket")
	public ResponseEntity<TicketShowDto> getReopenData()
	{
		return new ResponseEntity<TicketShowDto>(HttpStatus.OK);
	}
	
	
	@PutMapping("/breachAction/{ticketNumber}")
	public ResponseEntity<TicketShowDto> breachAction(@PathVariable Integer ticketNumber){
		return new ResponseEntity<>(breachTicketService.breachAction(ticketNumber),HttpStatus.OK);
	}
}
