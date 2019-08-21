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
	private String repoteeName;
	private String repoteeEmailId;
	private String companyName;
	private LocalDate whenBankAware;
	private LocalDate whenReported;
	private String reportingChannel;
	private String compromiseType;
	private String issueType;
	private Long cardNumber;
	private String cardHolderName;
	private Integer cardHolderAge;
	private String contactNo;
	private String reason;
	private String riskProfile;

}
