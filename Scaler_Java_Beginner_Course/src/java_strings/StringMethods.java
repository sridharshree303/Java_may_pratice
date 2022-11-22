package java_strings;

public class StringMethods {
	public static void main(String[] args) {
		
		String str = "Hello world";
		String str2 = new String("Hello world");
		//charAt()
		System.out.println(str.charAt(3)); // l
		System.out.println(str.charAt(6)); // w
		
		//length()
		System.out.println(str.length());  //11
		System.out.println("ram".length());// 3
		
		//indexOf()
		System.out.println(str.indexOf('w')); //6
		System.out.println(str.indexOf("lo")); //3
		
		//lastIndexOf()
		System.out.println(str.lastIndexOf('l')); //3
		
		//equals()
		System.out.println(str.equals(str2)); //true
		System.out.println(str == str2);	  //false
		
		//contains()
		System.out.println(str.contains("Hello")); //true
		System.out.println(str.contains("s"));	   //false
		
		//toLowerCase()
		System.out.println(str.toLowerCase()); //hello world
		System.out.println(str);			   //Hello world
		
		//toUpperCase()
		System.out.println(str.toUpperCase()); //HELLO WORLD
		String s3 = str.toUpperCase();
		System.out.println(s3);    // HELLO WORLD
		
		//replace(target,replace)
		String s1 = "I love coding. coding is awesome";
		String s2 = s1.replace("coding", "java");
		System.out.println(s2);  //I love java. java is awesome
		
		//concat()
		String s4 = s1.concat(" - Sridhar");
		System.out.println(s4); // I love coding. coding is awesome - Sridhar
		
		//substring(0,0)
		String ss = "HelloWorld";
		System.out.println(ss.substring(2,7)); //lloWo
		System.out.println(ss.substring(5));   //World

		//concatenation
		//process of appending two strings using + operater
		String one = "Hello";
		String two = "World";
		System.out.println(one+two); //HelloWorld
		
		int x = 5;
		String three = "String";
		System.out.println(three+x); //String5
		
		
	}
}
