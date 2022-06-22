package javabasics;

public class Factorial {

	public static void main(String[] args) {
		fact(5);
		fact(7);
		System.out.println(Math.max(4, 10));
	}
	public static void fact(int n) {
		int x = 1;
		for(int i = 1;i<=n;i++) {
			x = x*i;
		}
		System.out.println(x);
	}
	
}
