package com.cg.demo.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.demo.testing.model.Employee;

public interface Employeerepository extends JpaRepository<Employee, Integer>{
	
}
