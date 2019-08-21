package com.ing.breachmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.RiskProfileDetailsDto;

import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.entity.Role;
import com.ing.breachmanagement.repository.BreachRepository;
import com.ing.breachmanagement.repository.RoleRepository;

@Service

public class RiskProfileServiceImpl implements RiskProfileService{
@Autowired
BreachRepository breachRepository;
@Autowired
RoleRepository roleRepository;
	@Override
	public List<RiskProfileDetailsDto> getDetails(Integer roleId) {
	
		   List<RiskProfileDetailsDto> riskProfileDetailsDtos = new ArrayList<>();
		List<Role> role= roleRepository.findByroleId(roleId);
	
		String roleType=null;
		String mail=null;
		for(Role role1:role)
		{
			mail=role1.getEmail();
		roleType=role1.getRoleType();
		}
		List<Breach> breaches= breachRepository.findByRiskProfile(roleType);


		if(mail!=null)
{
			
			for(Breach breach :breaches)
			{
				 RiskProfileDetailsDto details = new RiskProfileDetailsDto();
				
				 BeanUtils.copyProperties(breach, details);
				
				
				riskProfileDetailsDtos.add(details);
				
				
				}
			RiskProfileDetailsDto details = new RiskProfileDetailsDto();
			
			details.setStatus("success");
			details.setMessage("display successful");
			details.setStatusCode(200);
			
		return riskProfileDetailsDtos;
			}
		
		else{
		RiskProfileDetailsDto details = new RiskProfileDetailsDto();
		details.setStatus("failure");
		details.setMessage("display not  successful");
		details.setStatusCode(200);
	riskProfileDetailsDtos.add(details);
	return riskProfileDetailsDtos;
	}
		
		
}
}
