package com.ing.breachmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.RiskProfileDetailsDto;
import com.ing.breachmanagement.dto.RiskProfileDto;
import com.ing.breachmanagement.service.RiskProfileService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class RiskProfileController {
	@Autowired
	RiskProfileService riskProfileService;
	
	
	@GetMapping(value="/breachInfo/{roleId}")
public ResponseEntity<List<RiskProfileDetailsDto>> breach(@PathVariable Integer roleId) {
		List<RiskProfileDetailsDto> riskProfileDto=riskProfileService.getDetails(roleId);
		return new ResponseEntity<List<RiskProfileDetailsDto>>(riskProfileDto,HttpStatus.OK);
	}
}
