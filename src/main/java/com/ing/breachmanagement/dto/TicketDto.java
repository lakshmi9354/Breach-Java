package com.ing.breachmanagement.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TicketDto implements Serializable{
	
	private static final long serialVersionUID = 669184201389936055L;
	
	private Integer ticketNumber;

}
