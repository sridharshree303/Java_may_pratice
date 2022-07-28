package com.cg.java.basics;

public class UserDefinedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4203070212241834691L;

	public UserDefinedException() {
		super("userdefinedexception");
	}
	
	public UserDefinedException(String s) {
		super(s);
	}
}
