package com.ing.breachmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.breachmanagement.dto.BreachDetailsDto;
import com.ing.breachmanagement.dto.BreachDto;
import com.ing.breachmanagement.dto.BussinessAreaDetailsDto;
import com.ing.breachmanagement.service.BreachService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = {"*","/"}, origins = {"*","/"})
public class BreachController {

	@Autowired
	BreachService breachService;
	
	@PostMapping("/breach")
	public ResponseEntity<BreachDetailsDto> breach(@RequestBody BreachDto breachDto){
			BreachDetailsDto breachDetailsDto = breachService.breach(breachDto);
		return new ResponseEntity<BreachDetailsDto>(breachDetailsDto,HttpStatus.CREATED);
	}
	
	@GetMapping("/bussinessarea/{id}")
	public ResponseEntity<List<BussinessAreaDetailsDto>> bussinessArea(@PathVariable("id")Integer id){
		List<BussinessAreaDetailsDto> bussinessAreaDetailsDto = breachService.bussinessArea(id);
		return new ResponseEntity<List<BussinessAreaDetailsDto>>(bussinessAreaDetailsDto,HttpStatus.OK);
	}
}
