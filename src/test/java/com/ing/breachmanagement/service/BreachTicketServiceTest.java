package com.ing.breachmanagement.service;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.hibernate.type.LocalDateType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.breachmanagement.dto.TicketShowDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.repository.BreachTicketRepository;

@RunWith(MockitoJUnitRunner.class)
public class BreachTicketServiceTest {
	
	@Mock
	BreachTicketRepository breachRepository;
	
	@InjectMocks
	BreachTicketService breachTicketService;
	
	
	@Test
	public void testGetReopenTicket() {
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
		breach.setBreachStatus("closed");
		Mockito.when(breachRepository.findByTicketNumber(org.mockito.Mockito.anyInt())).thenReturn(breach);
		breach.setBreachStatus("open");
		Mockito.when(breachRepository.save(Mockito.any())).thenReturn(breach);
		TicketShowDto breach1 = breachTicketService.breachAction(123456);
		assertEquals(breach1.getTicketId(), 123456);
	}

	@Test
	public void testBreachAction() {
		//TicketShowDto ticket = new TicketShowDto();
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
		Mockito.when(breachRepository.findByTicketNumber(org.mockito.Mockito.anyInt())).thenReturn(breach);
		breach.setBreachStatus("closed");
		Mockito.when(breachRepository.save(Mockito.any())).thenReturn(breach);
		TicketShowDto breach1 = breachTicketService.breachAction(123456);
		assertEquals(breach1.getTicketId(), 123456);
	}

}
