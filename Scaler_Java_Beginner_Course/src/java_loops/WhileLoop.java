package java_loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		int i=1; //intialization
		//condition
		while(i<=10) {
			System.out.println(i);
			i++; // update(Increment/decrement)
		}
		*/
		coutnDigits();
		
	}
	
	public static void coutnDigits() 
	{	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digits = 0;
		
		while(num > 0) {
			num /= 10;
			digits++;
		}
		System.out.println(digits);
		sc.close();
	}
}
