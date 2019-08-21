package com.ing.breachmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.BreachCategory;

@Repository
public interface BreachCategoryRepository extends JpaRepository<BreachCategory, Integer> {

}
