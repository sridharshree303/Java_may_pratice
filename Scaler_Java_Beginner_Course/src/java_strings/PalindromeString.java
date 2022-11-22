package java_strings;

import java.util.Scanner;

//Given a string, check whether it is a palindrome 
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//to generate the reverse of str
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		//Convert to string
		String rev = sb.toString();
		
		//equals method
		if(str.equals(rev)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
}


//tenet - yes