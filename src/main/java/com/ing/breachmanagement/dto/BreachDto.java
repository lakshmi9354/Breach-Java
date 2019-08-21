package com.ing.breachmanagement.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BreachDto implements Serializable{
	 
	private static final long serialVersionUID = -548891397680666993L;
	
	private String franchise;
	private String bussinessArea;
	private String breachCategory;
	private LocalDate whenBankAware;
	private LocalDate whenReported;
	private String reportingChannel;

}
