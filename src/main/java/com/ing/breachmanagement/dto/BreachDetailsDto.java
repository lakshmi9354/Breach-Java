package com.ing.breachmanagement.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BreachDetailsDto implements Serializable{
	
	private static final long serialVersionUID = 5247816370804022129L;
	
	private String status;
	private String message;
	private Integer statusCode;
	private Integer ticketNumber;

}
