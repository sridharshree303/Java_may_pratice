package com.example.UserManagement.exceptions;


public class DataAlreadyExistsException   extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataAlreadyExistsException() {
		super();
	}
	
	public DataAlreadyExistsException(String s) {
		super(s);
	}
}
