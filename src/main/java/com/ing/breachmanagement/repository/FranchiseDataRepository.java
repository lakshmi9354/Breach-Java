package com.ing.breachmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.Franchise;

@Repository
public interface FranchiseDataRepository extends JpaRepository<Franchise, Integer> {

}
