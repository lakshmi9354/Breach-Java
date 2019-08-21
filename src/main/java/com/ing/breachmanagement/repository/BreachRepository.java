package com.ing.breachmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.Breach;

@Repository
public interface BreachRepository extends JpaRepository<Breach, Integer> {

	List<Breach> findByRiskProfile(String roleType);

}
