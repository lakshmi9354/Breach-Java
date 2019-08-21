package com.ing.breachmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "breachcategory")
@Setter
@Getter
@ToString
public class BreachCategory {
	
	@Id
	private int id;
	private String category;
	private String riskprofile;
}
