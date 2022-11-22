package java_strings;

import java.util.Arrays;

//Strings stored in string pool or heap - immutable - N no of methods
//char arrays are stored in heap - mutable - no methods
public class StringAndCharArrays {
	public static void main(String[] args) {
		String str = "hello";
		char [] arr = {'h','e','l','l','o'};
		
		System.out.println(str); //hello
		System.out.println(arr); //hello
		
		//toCharArray()
		char[] arr2 = str.toCharArray();
		System.out.println(arr2); //hello
		System.out.println(Arrays.toString(arr2)); //[h, e, l, l, o]
	
		String str2 = new String(arr);
		System.out.println(str2.getClass()); //hello
		
		System.out.println(str.equals(arr));// false
		System.out.println(arr.equals(arr2));//false
		System.out.println(str.equals(str2));//true
		
	}
}
