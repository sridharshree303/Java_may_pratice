package dataStructures;

public abstract class StringEquals {
//	public static void main(String[] args) {
//		System.out.println("Inside");
//	}
	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = {'g','o','o','d'};
		
		String newStr = null;
		for(char ch : myCharArr) {
			newStr = newStr + ch;
		}
		
		System.out.println(newStr);
		System.out.println((newStr == myStr)+" "+(newStr.equals(myStr)));
	}
}
