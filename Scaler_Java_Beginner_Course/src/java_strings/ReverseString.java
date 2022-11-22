package java_strings;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("HELLO")); //OLLEH
		System.out.println(reverseString("SRIDHAR"));//RAHDIRS
		
		StringBuilder sb = new StringBuilder("SRIDHAR");
		StringBuilder str = sb.reverse();
		System.out.println(sb); //RAHDIRS
		System.out.println(str); //RAHDIRS
	}
	
	public static String reverseString(String str) {
		String rev = "";
		for(int i=str.length()-1;i >= 0;i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
}
