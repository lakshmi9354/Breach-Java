package com.ing.breachmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.entity.Risk;
import com.ing.breachmanagement.repository.RiskRepository;

@Service
public class RiskServiceForData implements RiskServiceForDataImpl {

	
	@Autowired
	RiskRepository riskRepository;
	
	public List<Risk> getFranchise()
	{
		//riskRepository.findAllByfranchise();
		return riskRepository.findDistinctAllByFranchise();
	}
}
