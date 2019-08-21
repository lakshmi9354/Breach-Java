package com.ing.breachmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.TicketDto;
import com.ing.breachmanagement.dto.TicketShowDto;
import com.ing.breachmanagement.service.BreachTicketService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = {"*","/"}, origins = {"*","/"})
public class ReopenController {
	
	@Autowired
	BreachTicketService breachTicketService;
	@PutMapping("/reopenTicket")
	public ResponseEntity<TicketShowDto> getReopenData(@RequestBody TicketDto ticketDto)
	{
		return new ResponseEntity<TicketShowDto>(breachTicketService.getReopenTicket(ticketDto.getTicketNumber()),HttpStatus.OK);
	}
	
	
	@PutMapping("/breachAction")
	public ResponseEntity<TicketShowDto> breachAction(@RequestBody TicketDto ticketDto){
		return new ResponseEntity<>(breachTicketService.breachAction(ticketDto.getTicketNumber()),HttpStatus.OK);
	}
}
