package com.ing.breachmanagement.service;

import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.LoginDetailsDto;
import com.ing.breachmanagement.dto.LoginDto;
@Service
public interface LoginService {

	public LoginDetailsDto login(LoginDto loginDto) ;
		


}
