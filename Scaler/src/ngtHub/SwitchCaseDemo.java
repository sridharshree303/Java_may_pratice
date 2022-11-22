package ngtHub;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		switchDemo();
	}
	
	public static void switchDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value");
		String str = (sc.nextInt() > 0) ? "Positive" : "Negative";
		System.out.println(str);
		System.out.print("Enter char : ");
		char c = sc.next().charAt(0);
		switch(c) {
		case 'a','e','i','o','u' -> System.out.println("Vowel");
		default -> System.out.println("Consonant");
		}
		
		System.out.println("do you want to run again (true/false)");
		boolean bb = sc.nextBoolean();
		if(bb) {
			System.out.println("Session restarted");
			switchDemo();
		}else {System.out.println("Session closed");}
	}
}
