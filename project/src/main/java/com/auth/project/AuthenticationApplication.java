package com.auth.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(AuthenticationApplication.class, args);
		System.out.println("Stop");
	}

}
