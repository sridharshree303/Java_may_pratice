package assigmnentBasics;

public class NextPalindromeNum {

	public static int nextPalindrome(int num) {
		//TODO next palindrome
		if(checkNines(num)) {
			return num+2;
		}
		else if(!checkPalindrome(num)) {
			
		}
		return 0;
	}
	
	public static boolean checkNines(int num) {
		//TODO check whether all nines or not
		return true;
	}
	
	public static boolean checkPalindrome(int num){
		//TODO whether its palindrome or not
		return true;
	}
	
	public static int convertNext(int num) {
		//TODO create next palindrome
		return 0;
	}
	
	public static void main(String[] args) {
		//TODO main method
	}
}
