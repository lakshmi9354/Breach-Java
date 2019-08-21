package com.ing.breachmanagement.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BussinessAreaDetailsDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer value;
	private String name;

}
