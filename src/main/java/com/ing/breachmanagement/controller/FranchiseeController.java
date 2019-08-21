package com.ing.breachmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.BreachCategoryDto;
import com.ing.breachmanagement.dto.FranchiseeDto;
import com.ing.breachmanagement.service.FranchiseeDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = {"*","/"}, origins = {"*","/"})
public class FranchiseeController {

	@Autowired
	FranchiseeDataService franchiseService;
	
	@GetMapping("/franchisee")
	public ResponseEntity<List<FranchiseeDto>> getFranchiseData()
	{
		return new ResponseEntity<List<FranchiseeDto>>(franchiseService.getFranchiseData(),HttpStatus.OK);
	}
	
	

	@GetMapping("/breachCategory")
	public ResponseEntity<List<BreachCategoryDto>> getBreachCategoryData()
	{
		return new ResponseEntity<List<BreachCategoryDto>>(franchiseService.getBreachCategory(),HttpStatus.OK);
	}
}
