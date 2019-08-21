package com.ing.breachmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.LoginDetailsDto;
import com.ing.breachmanagement.dto.LoginDto;
import com.ing.breachmanagement.service.LoginService;


@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class LoginController {
private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	
	@PostMapping("/login")
	public ResponseEntity<LoginDetailsDto> login(@RequestBody LoginDto loginDto)
	{
		LOGGER.info("inside modelbank");
		LoginDetailsDto loginResponseDto=loginService.login(loginDto);
		return new ResponseEntity<>(loginResponseDto,HttpStatus.OK);
	}
}
