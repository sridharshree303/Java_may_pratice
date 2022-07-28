package pluralsite.stringformatandregex;

import java.util.StringJoiner;

public class StringFormat {
	
	public static void main(String[] args) {
		stringJoinerDemo();
		//stringFormater();
		//formatFlags();
		
	}
	
	public static void stringJoinerDemo() {
		//StringJoiner sj = new StringJoiner(", ");          //alpha, theta, gamma, Sri
		//StringJoiner sj = new StringJoiner(", ", "{","}"); //{alpha, theta, gamma, Sri}
		StringJoiner sj = new StringJoiner("], [","[","]");  //[alpha], [theta], [gamma], [Sri]
		sj.add("alpha").add("theta").add("gamma");
		sj.add("Sri");
		String theResult = sj.toString();
		System.out.println(theResult);
		
		StringJoiner sj1 = new StringJoiner(",");
		sj1.setEmptyValue("EMPTY");
		String theResult1 = sj1.toString();
		System.out.println(theResult1);
	}
	
	public static void stringFormater() {
		int a =10,b=8,c =4;
		
		String str = String.format(" My nephews are %d, %d and %d years old ", a,b,c );
		System.out.println(str);
		// My nephews are 10, 8 and 4 years old 
		
		/*
		 * float -- %.1f
		 * decimal -- %d
		 * string -- %s
		 * 
		 */
	}
	
	public static void formatFlags() {
		String name = "Sridhar";
		
		String str1 = String.format("%#o",32);   //040
		String str2 = String.format("%#x",32);   //0x20
		String str3 = String.format("Y:%4d",32); //Y:  32 
		String str4 = String.format("Y:%04d",32);//Y:0032
		String str5 = String.format("Y:%-4d",32);//Y:32  ;
		
		String s1 = String.format("%d",3276674); //3276674
		String s2 = String.format("%,d",3276674); //3,276,674
		String s3 = String.format("%,.3f",3276674.6); //3,276,674.600
		
		
		/*
		 *  # - radix
		 *  0 - Zero padding
		 *  - - Left justify
		 *  , - grouping separate
		 *  + - symbol
		 *  ( - for negative number only (-342)
		 *  space - empty space % d
		 */
	}
}

