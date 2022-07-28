package pluralsite.demo;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Sridhar";
		s1 += "Love";
		String s2 = "Sridhar";
		s2 += "Love";
		
		String s3 = s1.intern();
		String s4 = s2.intern();
		
		if(s3==s4) {
			System.out.println("1st");
		}else if(s1.equals(s2)) {
			System.out.println("2nd");
		}else {
			System.out.println("Default");
		}
	}
}


/*
 * Strings are Immutable
 		-- Hold a reference to the  instance of the string
		-- Changes in the value create a new instance of the string

	 String msg = "I";
	 msg += "Love";
	 msg += "Java";
	 System.out.println(msg); // I Love Java
*/
//-------------------------------------------------------------------
/*Equality  (s1 == s2) // (s1.equals(s2))
 * 
	String s1 = "I Love ";
	s1 += "Java";
	String s2 = "I";
	s2 += " Love Java";

	if(s1 == s2)   // false
		System.out.println("Matched"); 
	else 
		System.out.println("Not Matched");
	
	if(s1.equals(s2)) 
		System.out.println("Matched");  // true
	else 
		System.out.println("Not Matched");
*/
//--------------------------------------------------------------
/*
 *Interning a String
 	- Provides a canonicalized value
 	- Enables reliable == operator comparison
	- Improves performance of frequently compared strings
		
		String s1 = "I Love ";
		s1 += "Java";
		String s2 = "I";
		s2 += " Love Java";
		String s3 = s1.intern();
		String s4 = s2.intern();
		if(s3 == s4) {
			System.out.println("Matched");  // true
		}
*/
//------------------------------------------------------------
/*
 * String methods and classes
 * 
 * Length  -- length
 * Create new Strings from existing 
 * 		   --  concat,replace,toLowerCase,toUpperCase,trim,split
 * Extract substring --  charAt,substring
 * Test substring -- contains,endsWith,startsWith,indexOf,lastIndexOf
 * Comparison -- equals,equalsIgnoreCase,isEmpty,compareTo,compareToIgnoreCase
 * Formatting -- format
 * String of non-string -- valueOf
*/
//------------------------------------------------------------
/*
 * String.valueOf
		int iVal = 100;
		String sVal = String.valueOf(iVal);  //"100"
 */

//--------------------------------------------------------------------

//String Builder
	//Provides mutable string buffer
	//  -- Efficiently constructs string values
	//  --  Add new content to end with append
	//  --  Add new content within or with insert

	//	String location = "Florida";
	//	int flightNumber = 175;
	//	StringBuilder sb = new StringBuilder(40);
	//	sb.append("I flew to ");
	//	sb.append(location);
	//	sb.append(" on Flight #");
	//	sb.append(flightNumber);
	//	String message = sb.toString();
	//	System.out.println(message);

	//add data in middle -- sb.insert(pos,"")

	//	String time = "9:00 AM";
	//	int pos = sb.indexOf(" on");
	//	sb.insert(pos," at ");
	//	sb.insert(pos+4,time);
	//	String updatedMessage = sb.toString();
	//	System.out.println(updatedMessage);
