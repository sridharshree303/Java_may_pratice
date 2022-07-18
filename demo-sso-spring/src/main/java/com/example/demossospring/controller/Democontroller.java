package com.example.demossospring.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class Democontroller {
	
	@GetMapping("/msg")
	public String greetUser(Principal principal) {
		System.out.println("message");
		return "Hello " + principal.getName()+" from application 1.";
	}
	
//	@GetMapping("/")
//	public String msg(Principal principal) {
//		return "Sridhar"+ principal.getName();
//	}
	
	@GetMapping("/login-success")
	public String LoginPage() {
		return "Login page";
	}
	
	@GetMapping("/logout-success")
	public String logoutPage() {
		return "logout- successful";
	} 
	
	@GetMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}

}
