package java_loops;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		//for(intialization;condtion;increment/decrement){}
		/*for(int i = 0;i < 5;i++) {
			System.out.println(i);
		}*/
		LargestNNumbers();
	}
	
	public static void LargestNNumbers() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int ans = 0;
		
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		
		for(int i=0; i < n;i++) {
			System.out.print(i+1+" value = ");
			int current = sc.nextInt();
			maxValue = Math.max(maxValue, current);
			minValue = Math.min(minValue, current);
			//ans = ans < current ? current : ans;
		}
		System.out.println("Largest of N numbers : "+maxValue);
		System.out.println("Smallest of N numbers : "+minValue);
		sc.close();
	}
}
