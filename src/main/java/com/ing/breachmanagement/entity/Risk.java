package com.ing.breachmanagement.entity;

import java.io.Serializable;

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
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Risk implements Serializable{

	private static final long serialVersionUID = -3476184773767856819L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer riskId;
	private String franchise;
	private String bussinessArea;
	private String breachCategory;
	private String riskProfile;


}
