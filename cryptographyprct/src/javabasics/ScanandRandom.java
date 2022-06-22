package javabasics;

import java.util.Random;
import java.util.Scanner;

public class ScanandRandom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		Random rn = new Random();
		System.out.println(rn.nextInt());		
	}
}
