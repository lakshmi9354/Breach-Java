package com.ing.breachmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.breachmanagement.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>{

	List<Role> findByroleId(Integer roleId);

	Role findByemailAndPassword(String email, String password);

	

}
