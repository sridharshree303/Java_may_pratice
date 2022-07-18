package com.example.UserManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		System.out.println("Start..");
		SpringApplication.run(UserManagementApplication.class, args);
		System.out.println("End.."); 
	}
}
