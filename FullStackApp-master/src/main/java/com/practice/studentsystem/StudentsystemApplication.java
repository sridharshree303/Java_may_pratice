package com.practice.studentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsystemApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(StudentsystemApplication.class, args);
		System.out.println("Stop");
	}

}
