package javabasics;

public class Operaters {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		int max;
		// max is false statement , n2 is result
		max = (n1>n2) ? n1 : n2;
		System.out.println(max);
	
	System.out.println("----------------------------");
	for(int i = 1; i<=10;i++) {
		if(i == 5) {
			continue;
		}
		System.out.println(i);
	}
	}
}
