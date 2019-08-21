package com.ing.breachmanagement.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.LoginDetailsDto;
import com.ing.breachmanagement.dto.LoginDto;
import com.ing.breachmanagement.entity.Role;
import com.ing.breachmanagement.repository.RoleRepository;

@Service

public class LoginServiceImpl  implements LoginService{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	RoleRepository roleRepository;

	@Override
	public LoginDetailsDto login(LoginDto loginDto) {
		LoginDetailsDto loginResponseDto = new LoginDetailsDto();
		Role  role = roleRepository.findByemailAndPassword(loginDto.getEmail(), loginDto.getPassword());
		
		if (role != null) {
			LOGGER.info("user fetched");
			loginResponseDto.setRoleId(role.getRoleId());
			loginResponseDto.setMessage("LoggedIn Successfully..");
			loginResponseDto.setStatus("SUCCESS");
			return loginResponseDto;
		} else {
			loginResponseDto.setMessage("Login Failed...");
			loginResponseDto.setStatus("FAILURE");
			return loginResponseDto;
		}

	}
}
