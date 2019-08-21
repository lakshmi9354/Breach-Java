package com.ing.breachmanagement.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.hibernate.type.LocalDateType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.ing.breachmanagement.dto.TicketShowDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.service.BreachTicketService;


@RunWith(MockitoJUnitRunner.class)
public class ReopenControllerTest {
	
	@Mock
	BreachTicketService breachTicketService;
	
	@InjectMocks
	ReopenController reopenController;
	
	
	@Test
	public void testGetReopenData() {
		Breach breach = new Breach();
		LocalDateType date = new LocalDateType();
		breach.setBreachCategory("business");breach.setBreachId(123);
		breach.setBreachStatus("open");
		breach.setCardHolderAge(25);
		breach.setCardHolderName("sarath");
		breach.setCardNumber(2233L);
		breach.setCompanyName("Hcl");
		breach.setCompromiseType("debit");
		breach.setContactNo("786");
		breach.setFranchise("gd");
		breach.setIssueType("debit");
		breach.setReason("az");
		breach.setReportingChannel("offline");
		breach.setRepoteeEmailId("sarath");
		breach.setRepoteeName("sarath");
		breach.setRiskProfile("high");
		breach.setRoleId(123);
		breach.setTicketNumber(123456);
		breach.setTicketStatus("true");
		//breach.setWhenBankAware(date);
		//breach.setWhenReported(whenReported);
		breach.setBreachStatus("open");
		TicketShowDto ticket = new TicketShowDto();
		ticket.setTicketId(breach.getTicketNumber());
		ticket.setTicketStatus("breach opened successfully");
		Mockito.when(breachTicketService.breachAction(Mockito.anyInt())).thenReturn(ticket);
		//Mockito.when(breachTicketService.save(Mockito.any())).thenReturn(breach);
		ResponseEntity<TicketShowDto> breach1 = reopenController.breachAction(123456);
		assertEquals(breach1.getBody().getTicketId(), 123456);
	}

	@Test
	public void testBreachAction() {
		Breach breach = new Breach();
		LocalDateType date = new LocalDateType();
		breach.setBreachCategory("business");breach.setBreachId(123);
		breach.setBreachStatus("open");
		breach.setCardHolderAge(25);
		breach.setCardHolderName("sarath");
		breach.setCardNumber(2233L);
		breach.setCompanyName("Hcl");
		breach.setCompromiseType("debit");
		breach.setContactNo("786");
		breach.setFranchise("gd");
		breach.setIssueType("debit");
		breach.setReason("az");
		breach.setReportingChannel("offline");
		breach.setRepoteeEmailId("sarath");
		breach.setRepoteeName("sarath");
		breach.setRiskProfile("high");
		breach.setRoleId(123);
		breach.setTicketNumber(123456);
		breach.setTicketStatus("true");
		//breach.setWhenBankAware(date);
		//breach.setWhenReported(whenReported);
		breach.setBreachStatus("open");
		TicketShowDto ticket = new TicketShowDto();
		ticket.setTicketId(breach.getTicketNumber());
		ticket.setTicketStatus("breach closed successfully");
		Mockito.when(breachTicketService.breachAction(Mockito.anyInt())).thenReturn(ticket);
		//Mockito.when(breachTicketService.save(Mockito.any())).thenReturn(breach);
		ResponseEntity<TicketShowDto> breach1 = reopenController.breachAction(123456);
		assertEquals(breach1.getBody().getTicketId(), 123456);
	}

}
