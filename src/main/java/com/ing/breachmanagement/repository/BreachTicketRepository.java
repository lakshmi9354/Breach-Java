package com.ing.breachmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.Breach;

@Repository
public interface BreachTicketRepository extends JpaRepository<Breach, Integer> {

	public Optional<Breach> findBybreachId(int breachId);
	
	public Optional<Breach> findByticketNumber(int ticketNumber);
	
}
