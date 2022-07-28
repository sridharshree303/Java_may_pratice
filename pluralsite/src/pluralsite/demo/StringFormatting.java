package pluralsite.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringFormatting {
	public static void main(String[] args) {
		concatvsformat();
		//formatFlags();
		dateTime();
	}
	
	public static void dateTime() {
		LocalDate startDate = LocalDate.now();
		System.out.println(startDate);
		LocalDate newDate = startDate.plusDays(100);
		System.out.println(newDate);  // format tag for date is %s
		
		// date formatting
		DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println(startDate.format(usDateFormat));
		
		//parse a String with dateTimeFormater
		String usDaString = "07-12-2022";
		LocalDate theDate = LocalDate.parse(usDaString,usDateFormat);
		System.out.println(theDate);
	}
	
	public static void checkRelationship(Instant otherInstant) {
		Instant nowInstant = Instant.now();
		if(otherInstant.compareTo(nowInstant)>0)
			System.out.println("Instant in the future");
		else if(otherInstant.compareTo(nowInstant)<0)
			System.out.println("Instant in the past");
		else
			System.out.println("Instant is now");
	}
	
	public static void formatFlags() {
		// # = include radix
		// 0 = Zero-padding
		// - = Left justify
		// , = Include grouping separator
		// + = + symbol on integer
		
		int w = 5, x = 235, y = 481, z = 12;
		
		String s1 = String.format("W:%d X:%d", w,x);
		System.out.println(s1);
		
		String s2 = String.format("W:%3d X:%5d", w,x);
		System.out.println(s2);
		
		String s3 = String.format("W:%03d X:%05d", w,x);
		System.out.println(s3);
		
		//left justify
		String s4 = String.format("W:%-3d X:%-5d", w,x);
		System.out.println(s4);

		int num = 3473784;
		double num1 = 8748724.3d;
		int num2 = 874;
		int num3 = -484;
		
		String n1 = String.format("%d",num);
		String n2 = String.format("%,d",num);
		String n3 = String.format("%,.2f",num1);
		String n4 = String.format("%+d",num2);
		String n5 = String.format("%+d",num3);
		String n6 = String.format("%(d",num2);
		String n7 = String.format("% d",num2);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		
		// Argument index
	}
	
	public static void concatvsformat() {
		//concatenation vs Formatting
		
		int david = 17, dawson = 15, dillon = 8 ,gordon = 6;
		
		//concatenation
		String s1 = "My nephews are "+david+", "+dawson+", "+dillon+", and "+
						gordon+" years old";
		
		//formatting
		String s2 = String.format("My nephews are %d, %d, %d, and %d years old",david,dawson,gordon,dillon);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//My nephews are 17,15,8 and 6 years old
		
		// float values
		
		int x  = 11;
		int y = 3;
		double value = (x+y)/3.0d;
		
		String s4 =String.format("the correct answer is %.4f resulted",value);
		System.out.println(s4);
		//the correct answer is 4.67 resulted
		
	}
}
