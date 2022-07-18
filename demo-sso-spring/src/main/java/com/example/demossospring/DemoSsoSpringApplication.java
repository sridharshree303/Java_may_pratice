package com.example.demossospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
//@EnableOAuth2Sso
public class DemoSsoSpringApplication {
	

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(DemoSsoSpringApplication.class, args);
		System.out.println("stop");
	}

}
