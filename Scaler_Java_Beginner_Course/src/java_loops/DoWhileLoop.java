package java_loops;

import java.util.Scanner;

// given a streamof numbers, read all the numbers till you read a -ve integer and
// print their sum of numbers read so far.

public class DoWhileLoop {
	public static void main(String[] args) {
		/*
		//int i = -2; //-2
		int i = 5;	  // 5,4,3,2,1
		do {
			System.out.println(i);
			i--;
		}while(i > 0);
		*/
		SumOfPostiveNumbers();
	}
	
	public static void SumOfPostiveNumbers() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		
		do {
			num = sc.nextInt();
			sum += num;
		}while(num >= 0);
		sc.close();
		System.out.println("Sum : "+sum);
	}
}
