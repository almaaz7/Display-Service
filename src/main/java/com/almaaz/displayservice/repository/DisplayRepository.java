package com.almaaz.displayservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.almaaz.displayservice.model.Employee;

public interface DisplayRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByName(String name);
	

}
