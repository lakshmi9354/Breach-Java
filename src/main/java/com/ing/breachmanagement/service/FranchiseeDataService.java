package com.ing.breachmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.BreachCategoryDto;
import com.ing.breachmanagement.dto.FranchiseeDto;
import com.ing.breachmanagement.entity.BreachCategory;
import com.ing.breachmanagement.entity.Franchise;
import com.ing.breachmanagement.repository.BreachCategoryRepository;
import com.ing.breachmanagement.repository.FranchiseDataRepository;

@Service
public class FranchiseeDataService {
	
	@Autowired
	FranchiseDataRepository franchiseRepository;
	
	@Autowired
	BreachCategoryRepository breachRepository;
	
	public List<FranchiseeDto> getFranchiseData()
	{
		List<Franchise> franchiseData = franchiseRepository.findAll();
		List<FranchiseeDto> franchiseDtoData = new ArrayList<FranchiseeDto>();
		for(int i =0;i<franchiseData.size();i++)
		{
			FranchiseeDto franchiseeDto = new FranchiseeDto();
			franchiseeDto.setName(franchiseData.get(i).getFranchise().toString());
			franchiseeDto.setValue(franchiseData.get(i).getId());
			franchiseDtoData.add(franchiseeDto);
		}
		return franchiseDtoData;
	}
	
	
	public List<BreachCategoryDto> getBreachCategory()
	{
		List<BreachCategory> breachData = breachRepository.findAll();
		List<BreachCategoryDto> breachDataDto = new ArrayList<BreachCategoryDto>();
		for(int i =0; i<breachData.size();i++)
		{
			BreachCategoryDto breachDto = new BreachCategoryDto();
			breachDto.setValue(breachData.get(i).getId());
			breachDto.setName(breachData.get(i).getCategory().toString());
			breachDataDto.add(breachDto);
		}
		return breachDataDto;
	}

}
