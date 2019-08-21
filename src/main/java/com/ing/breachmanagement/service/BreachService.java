package com.ing.breachmanagement.service;

import java.util.List;

import com.ing.breachmanagement.dto.BreachDetailsDto;
import com.ing.breachmanagement.dto.BreachDto;
import com.ing.breachmanagement.dto.BussinessAreaDetailsDto;

public interface BreachService {
	public BreachDetailsDto breach(BreachDto breachDto);
	public List<BussinessAreaDetailsDto> bussinessArea(Integer id);
}
