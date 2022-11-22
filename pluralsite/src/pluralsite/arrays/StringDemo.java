package pluralsite.arrays;

import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {
		// StringTokenizer
		System.out.println("==============================");
		StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class", " ");
		// if u remove , then the words split as per space " "

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// Spilt method
		String s1 = "welcome to split world";
		System.out.println("==============================");
		for (String w : s1.split("\\s", 0)) {
			System.out.println(w);
		}

		System.out.println("==============================");
		// StringBuffer
		StringBuffer sb = new StringBuffer("Hello");
		// sb.delete(2,4);
		sb.reverse();
		System.out.println(sb.capacity()); // 16+5
		System.out.println(sb);

		System.out.println("==============================");
		// StringBuilder(): Constructs a string builder with no characters in it and an
		// initial capacity of 16 characters.
		StringBuilder str = new StringBuilder();

		str.append("GFG");

		// print string
		System.out.println("String = " + str.toString());

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + str1.toString());

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = " + str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(str1.toString());

		// print string
		System.out.println("String3 = " + str3.toString());
	}
}
