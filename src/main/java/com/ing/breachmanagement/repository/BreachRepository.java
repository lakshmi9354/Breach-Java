package com.ing.breachmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.breachmanagement.entity.Breach;

public interface BreachRepository extends JpaRepository<Breach, Long>{

}
