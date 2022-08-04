package com.cg.demo.testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.cg.demo.testing.model.Employee;
import com.cg.demo.testing.repository.Employeerepository;
import com.cg.demo.testing.services.EmployeeServicesImple;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepositoryTests {
	
	@Autowired
	private Employeerepository employeerespository;
	
	@Autowired
	private EmployeeServicesImple empservice;
	
	@Test
	@Rollback
	public void saveEmployee() {
		Employee emp = new Employee(1,"sridhar","kolluru","Sridhar@gmail.com");
		Employee savedEmployee =  employeerespository.save(emp);
		
		assertNotNull(savedEmployee);
		System.out.println(savedEmployee);
	}
	
	public Employee testSaveEmployee(Employee employee) {
		
		return employee;
	}
}
