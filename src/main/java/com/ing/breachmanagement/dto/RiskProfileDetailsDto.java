package com.ing.breachmanagement.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class RiskProfileDetailsDto {
	
	private String status;
	private Integer statusCode;
	private String message;

	private String	franchise;
	private String	bussinessArea;
	private String breachCategory;
	private String	repoteeName;
	private String	repoteeEmailId;
	private String	reason;
private Integer	ticketNumber;
	private String	breachStatus;
	private String	ticketStatus;
	

}
