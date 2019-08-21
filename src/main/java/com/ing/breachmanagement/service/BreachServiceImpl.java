package com.ing.breachmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.breachmanagement.dto.BreachDetailsDto;
import com.ing.breachmanagement.dto.BreachDto;
import com.ing.breachmanagement.dto.BussinessAreaDetailsDto;
import com.ing.breachmanagement.entity.Breach;
import com.ing.breachmanagement.entity.BreachCategory;
import com.ing.breachmanagement.entity.BussinessArea;
import com.ing.breachmanagement.repository.BreachCategoryRepository;
import com.ing.breachmanagement.repository.BreachRepository;
import com.ing.breachmanagement.repository.BussinessAreaRepository;

@Service
public class BreachServiceImpl implements BreachService {

	@Autowired
	BreachRepository breachRepository;

	@Autowired
	BussinessAreaRepository bussinessRepository;

	@Autowired
	BreachCategoryRepository breachCategoryRepository;

	@Override
	public BreachDetailsDto breach(BreachDto breachDto) {
		BreachDetailsDto breachDetailsDto = null;
		List<BussinessArea> bussinessArea = bussinessRepository.findAll();
		List<BreachCategory> breachCategories = breachCategoryRepository.findAll();
		for (BussinessArea bussArea : bussinessArea) {
			if (breachDto.getBussinessArea().equalsIgnoreCase(bussArea.getBussinessarea())) {
				for (BreachCategory breachCategory : breachCategories) {
					if (breachDto.getBreachCategory().equalsIgnoreCase(breachCategory.getCategory())) {
						Breach breach = new Breach();
						Random random = new Random();
						BeanUtils.copyProperties(breachDto, breach);
						breach.setBreachStatus("open");
						breach.setTicketStatus("");
						breach.setTicketNumber(random.nextInt(1000000));
						breach.setRiskProfile(breachCategory.getRiskprofile());
						breachRepository.save(breach);
						breachDetailsDto = new BreachDetailsDto();
						breachDetailsDto.setMessage("Breach Created Successfully..");
						breachDetailsDto.setStatus("SUCCESS");
						breachDetailsDto.setStatusCode(201);
						breachDetailsDto.setTicketNumber(breach.getTicketNumber());
					}
				}

			}

		}
		return breachDetailsDto;
	}

	@Override
	public List<BussinessAreaDetailsDto> bussinessArea(Integer id) {
		List<BussinessArea> bussinessArea = bussinessRepository.findByfid(id);
		List<BussinessAreaDetailsDto> bussinessAreaDetailsDtos = new ArrayList<BussinessAreaDetailsDto>();
		for (BussinessArea buArea : bussinessArea) {
			BussinessAreaDetailsDto bussinessAreaDetailsDto = new BussinessAreaDetailsDto();
			bussinessAreaDetailsDto.setName(buArea.getBussinessarea());
			bussinessAreaDetailsDto.setValue(buArea.getId());
			bussinessAreaDetailsDtos.add(bussinessAreaDetailsDto);
		}
		return bussinessAreaDetailsDtos;
	}
}
