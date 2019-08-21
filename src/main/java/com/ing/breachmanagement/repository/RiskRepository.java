package com.ing.breachmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.Risk;

@Repository
public interface RiskRepository extends JpaRepository<Risk, Integer> {

	public Optional<Risk> findByfranchiseAndBussinessAreaAndAndBreachCategory(String franchise, String bussinessArea,String breachCategory);
	
	@Query(value = "select distinct(r.franchise) from risk r", nativeQuery = true)
	public List<Risk> findDistinctAllByFranchise();
	
}
