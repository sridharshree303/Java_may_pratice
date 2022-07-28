package com.cg.java.basics;

public class StringDemo {

	public static void main(String[] args) {
		
		ROLE rr = ROLE.ADMIN;
		System.out.println(rr);
		
		String ss = new String("Sridhar naidu kolluru");
		String[] str = ss.split("\\b");
		for(String ssr : str) {
			System.out.println(ssr);
		}
		
		
//		System.out.println(ss);
//		String ss1 = new String();
//		ss1 = "hello";
//		System.out.println(ss1);
//		
//		System.out.println(ss1.toUpperCase()); //uppercase
//		System.out.println(ss.toLowerCase());   //lowercase
//		System.out.println(ss.length());
//		System.out.println(ss.charAt(3));
//		
//		System.out.println(ss.substring(2,6));
//		System.out.println(ss.indexOf("a"));
//		System.out.println(ss.lastIndexOf("r"));
	}
}
