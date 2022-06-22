package javabasics;

public class Operators {
	public static void main(String[] args) {
		//equals method
		String s1 = new String("Sridhar");
		String s2 = "Sridhar";
		System.out.println(s1.equals(s2));
		
		//Right shift operator
		int x = 24;        // 2^3 = 8   24/8 = 3
		x = x>>3;
		System.out.println(x);
		
		//Left Shift operator
		int y = 9;         // 2^3 = 8  8*9 = 72
		y = y << 3;
		System.out.println(y);
		
		//final keyword
		final int value = 100;
		System.out.println(value);
		System.out.println(value+10);
		
		//print ASCII values
//		for(int i=40;i<60;i++) {
//			System.out.println((char)i);
//		}
		System.out.println("--------------");
		//Casting demo
		int e = 10;
		char ch = 'w';
		System.out.println(e+ch);
		
		byte b1 = 10, b2 = 20, b3 = (byte) (b1+b2);
		System.out.println(b3);
		
		
		
	}
}
