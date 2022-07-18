package com.example.UserManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	//@NotBlank(message= "Please add student name")
	private String name;

	private String address;

	//@Size(min = 8, message = "subject should have at least 8 characters")
	private String subject;

	public Student(Long id, String name, String address, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.subject = subject;
	}
	
	public Student()
	{
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", subject=" + subject + "]";
	}

}
