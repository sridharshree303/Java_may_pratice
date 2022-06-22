package com.practice.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee{
	
	@Autowired
	private Department department;

	public Employee(Department department) {
		super();
		System.out.println("Parameterized constructor..");
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		System.out.println("setter method..");
		this.department = department;
	}
}



//property injection or setter injection example
//@Component
//public class Employee {
//
//	private int id;
//	private String name;
//	private double salary;
//	private Department dept;
//	
//	public Employee(int id, String name, double salary, Department dept) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.dept = dept;
//	}
//	
//	public Employee() {
//		
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
//	public Department getDept() {
//		return dept;
//	}
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
//	}
//	
//	public void work() {
//		System.out.println("Employee works...");
//	}
//	
//	
//}
