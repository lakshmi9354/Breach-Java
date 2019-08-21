package com.ing.breachmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.TicketShowDto;

@RestController
public class ReopenController {

	@PutMapping("/reopenTicket")
	public ResponseEntity<TicketShowDto> getReopenData()
	{
		return new ResponseEntity<TicketShowDto>(HttpStatus.OK);
	}
	
}
