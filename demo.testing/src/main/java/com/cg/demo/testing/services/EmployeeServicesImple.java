package com.cg.demo.testing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.testing.model.Employee;
import com.cg.demo.testing.repository.Employeerepository;

@Service
public class EmployeeServicesImple {

	@Autowired
	private Employeerepository emprepository;
	
	public Employee saveEmployee(Employee employee) {
		
		return emprepository.save(employee);
	
	}
	
}
