package com.ing.breachmanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="breach")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Breach implements Serializable {

	private static final long serialVersionUID = 3705942497400021488L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer breachId;
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
	private String breachStatus;
	private String ticketStatus;
	private Integer ticketNumber;
	private String riskProfile;

}
