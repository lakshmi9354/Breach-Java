package com.ing.breachmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.RiskProfileDetailsDto;

@Service
public interface RiskProfileService {

	List<RiskProfileDetailsDto> getDetails(Integer roleId);

}
