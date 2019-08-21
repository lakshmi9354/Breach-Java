package com.ing.breachmanagement.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ing.breachmanagement.dto.LoginDetailsDto;
import com.ing.breachmanagement.dto.LoginDto;
import com.ing.breachmanagement.entity.Role;
import com.ing.breachmanagement.repository.RoleRepository;


@RunWith(SpringJUnit4ClassRunner.class)
public class LoginServiceTest {

	@Mock
	RoleRepository roleRepository;
	
	@InjectMocks
	LoginServiceImpl loginService;
	
	LoginDto loginDto = null;
	LoginDetailsDto loginDetailsDto = null;
	LoginDetailsDto loginDetailsDto1 = null;
Role role = null;
	
	@Before
	public void setup() {
		loginDto = new LoginDto();
		loginDto.setEmail("lak@gmail.com");
		loginDto.setPassword("lak");
		loginDetailsDto = new LoginDetailsDto();
		loginDetailsDto.setMessage("LoggedIn Successfully..");
		loginDetailsDto.setStatus("SUCCESS");
		loginDetailsDto1 = new LoginDetailsDto();
		loginDetailsDto1.setMessage("Login Failed...");
		loginDetailsDto1.setStatus("FAILURE");
		
		Role role = new Role();
		role.setEmail("lak@gmail.com");
	}
	
	@Test
	public void loginSuccessTest() {
		Mockito.when(roleRepository.findByemailAndPassword("961833", "lak")).thenReturn(role);
		assertEquals(loginDetailsDto1.toString(), loginService.login(loginDto).toString());
	}
	
	@Test
	public void loginNullTest() {
		Mockito.when(roleRepository.findByemailAndPassword("961833", "lak")).thenReturn(null);
		assertEquals(loginDetailsDto1.toString(), loginService.login(loginDto).toString());
	}
}
