package javabasics;

public class ArraysMulti {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[5];
		int count = 5;
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = ++count;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println("\nSum of Two arrays : ");
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i]+b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}

