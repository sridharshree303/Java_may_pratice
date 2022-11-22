package java_wrapperClasses;

import java.util.ArrayList;

//Wrapper classes provides provide a mechanisam to use primitive data types as objects

public class WrappersDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		// AutoBoxing
		int x = 5;
		float y = 3.14F;
		long z = 6000;

		Integer intobj = x;
		Float floatobj = y;
		Long longobj = z;

		System.out.println(intobj + " " + floatobj + " " + longobj);

		// Wrapper methods
		System.out.println(Integer.MAX_VALUE); // 2147483648
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.BYTES); // 4
		System.out.println(Integer.max(5, 3)); // 5

		String ss = new String("1000");
		System.out.println(Integer.parseInt(ss)); // 1000

		// Unboxing
		Integer num = 5;
		Float ff = 2.1F;
		Character c = 'x';

		int n = num;
		float f = ff;
		char ch = c;
		System.out.println(num + ff + c); //127.1
		System.out.println(5+c); //125

		System.out.println(n);  //5
		System.out.println(f);  //2.1
		System.out.println(ch); //x

		// Primitive data types are faster than wrapper classes
		// Better to use primitive data types for faster for simple use
	}
}

//Why we need wraaper classes ?
//--> Collections -- The java collections require objects instead of primitive types
//--> Synchronization -- Java synchronization works with objects in multithreading
//