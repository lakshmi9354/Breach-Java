package com.ing.breachmanagement.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class LoginDetailsDto {
	private String message;
	private Integer roleId;
	private String status;

}
