package com.ing.breachmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.Breach;

@Repository
public interface BreachTicketRepository extends JpaRepository<Breach, Integer> {

	public Optional<Breach> findBybreachId(int breachId);
	@Query("select c from Breach c where c.ticketNumber=:ticketnumber")
	public Breach findByTicketNumber(@Param("ticketnumber") Integer ticketNumber);
	
}
