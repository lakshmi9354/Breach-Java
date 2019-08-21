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
public class Role implements Serializable{
	
	private static final long serialVersionUID = -5208620713610033808L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleId;
	private String name;
	private String roleType;
	private String email;
	private String password;

}
