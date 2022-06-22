package javabasics;

public class UserDefinedMethod {
	public static void main(String[] args) {
		evenOdd(12);
	}
	
	public static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println(n+" Number is even");
		}else {
			System.out.println(n+" Number is Odd");
		}
	}
}
