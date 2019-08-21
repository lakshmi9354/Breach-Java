package com.ing.breachmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.breachmanagement.entity.BussinessArea;

public interface BussinessAreaRepository extends JpaRepository<BussinessArea, Long> {

	//@Query(value = "select b.bussinessarea,b.id from bussinessarea b,franchise f where f.id = b.f_id and b.f_id =:id", nativeQuery = true)
	//List<BussinessArea> findByfid(@Param("id") int id);
	
	public List<BussinessArea> findByfid(Integer id);

}
