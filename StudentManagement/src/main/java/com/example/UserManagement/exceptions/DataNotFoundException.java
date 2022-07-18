package com.example.UserManagement.exceptions;

public class DataNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DataNotFoundException() {
		super();
	}
	
	public DataNotFoundException(String s) {
		super(s);
	}
}