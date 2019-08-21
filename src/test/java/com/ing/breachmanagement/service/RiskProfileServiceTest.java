package com.ing.breachmanagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.breachmanagement.dto.RiskProfileDetailsDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.entity.Role;
import com.ing.breachmanagement.repository.BreachRepository;
import com.ing.breachmanagement.repository.RoleRepository;

@RunWith(MockitoJUnitRunner.class)
public class RiskProfileServiceTest {
	@Mock 
	BreachRepository breachRepository;
	@InjectMocks
	RiskProfileServiceImpl riskProfileService;
	@Mock
	RoleRepository roleRepository;
@Test
public void testgetDetails() {
Role role=new Role();
role.setEmail("hai");
role.setRoleId(1);
List<Role> role1=new ArrayList<Role>();
role1.add(role);
	RiskProfileDetailsDto riskProfileDetailsDto=new 	RiskProfileDetailsDto ();
	riskProfileDetailsDto.setBreachCategory("business");
	riskProfileDetailsDto.setBreachStatus("open");
	riskProfileDetailsDto.setMessage("display successFull");
	riskProfileDetailsDto.setStatus("ok");
	riskProfileDetailsDto.setStatusCode(200);
	List<RiskProfileDetailsDto> dto=new ArrayList<RiskProfileDetailsDto>();
	dto.add(riskProfileDetailsDto);
	List<Breach> b=new ArrayList<Breach>();
	Breach breach =new Breach();
	breach.setBreachId(1);
	breach.setBreachCategory("business");
	breach.setCardNumber(1234l);
	breach.setCardHolderAge(23);
	breach.setCardHolderName("sai");
	
	b.add(breach);
	Mockito.when(roleRepository.findByroleId(role.getRoleId())).thenReturn(role1);
Mockito.when(breachRepository.findByRiskProfile(role.getRoleType())).thenReturn(b);
List<RiskProfileDetailsDto> riskProfileDetailsDtos=riskProfileService.getDetails(role.getRoleId());
assertNotNull(riskProfileDetailsDtos);
assertEquals(1,riskProfileDetailsDtos.size());

}
}