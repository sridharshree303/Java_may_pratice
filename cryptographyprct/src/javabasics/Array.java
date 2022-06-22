package javabasics;

public class Array {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int[] b = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int c[] = new int[5];
		System.out.println(c); // object address
	}
}
