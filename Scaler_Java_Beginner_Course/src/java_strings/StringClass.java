package java_strings;

public class StringClass {
	public static void main(String[] args) {

		// String Pool -- The string pool is the area in the heap memory where string literals are stored
		// s1 and s2 both data is stores a same data in stringpool 
		// and the s1 and s2 are refrences for the data 
		// s3 will store as different
		String s1 = "abc";
		String s2 = "abc"; 
		String s3 = "def";
		s2 = "Sridhar";  // assigned to s2
		
		// checking string pool and heap memory data
		String s4 = new String("abc");
		System.out.println(s4 == s1); // false
		System.out.println(s4.equals(s1)); //true
		
		// checking stringpools data
		String s5 = "abc";
		System.out.println(s5 == s1); //true
		System.out.println(s5.equals(s1)); //true
		
		//equals checks the content of the object
		// s1 == s3 checks the objects 
		
		basics();
	}
	
	public static void basics() {
		//basics();
		//Strings in java are immutable
		String s= "Hello";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		String s1 = " Ram";
		s.concat(s1); // will not work..have to assign a new refrence
		System.out.println(s.concat(" Sri"));
		String s2 = s.concat(s1);
		System.out.println(s2);
	}
}


