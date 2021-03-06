package cryptographylearn;

public class WordPlay {

	public static void main(String[] args) {
		WordPlay wp = new WordPlay();
		wp.testisVowel();
		wp.testreplaceVowels();
		wp.testemphasize();
	}
	
//	# Write a method isVowel that has one Char parameter named ch. 
//	# This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) 
//	# and false otherwise. You should write a tester method to see if this method works correctly. 

	public boolean isVowel(char parameter) {
	        parameter = Character.toLowerCase(parameter);
	        if (parameter == 'a' | parameter == 'e'
	            | parameter == 'i' | parameter == 'o'
	            | parameter == 'u')
	            return(true);
	        else return(false);
	    }
	    
	public void testisVowel() {
	    char str = 'f';
	    boolean result = isVowel(str);
	    System.out.println(result);
	}
	    
//	# Write a method replaceVowels that has two parameters, a String named phrase and a Char named ch. 
//	# This method should return a String that is the string phrase with all the vowels (uppercase or lowercase) replaced by ch.

	public StringBuilder replaceVowels(StringBuilder phrase, Character ch) {
	        for (int i = 0; i < phrase.length(); i++) {
	               char str = phrase.charAt(i);
	               if (isVowel(str)) 
	            	   phrase.setCharAt(i, ch);
	        }
	        return(phrase);
	    }
	    
	public void testreplaceVowels() {
	        StringBuilder phrase = new StringBuilder("apple");
	        StringBuilder result = replaceVowels(phrase, '*');
	        System.out.println(result);
	    }

//	# Write a method emphasize with two parameters, a String named phrase and a character named ch. 
//	# This method should return a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by
//	# ?*? if it is in an odd number location in the string (first character has index 0, third character has index 2, etc.), or
//	# ?+? if it is in an even number location in the string (second character has index 1, fourth character has index 3, etc.).

	public StringBuilder emphasize(StringBuilder phrase, char ch) {
	        for (int i = 0; i < phrase.length(); i++) {
	            char str = phrase.charAt(i);
	            if (str == ch) {
	                if (i%2 == 0) phrase.setCharAt(i, '*');
	                else phrase.setCharAt(i, '+');
	            }
	        }
	        return(phrase);
	 }
	    
	public void testemphasize() {
	        StringBuilder phrase = new StringBuilder("dna ctgaaactga");
	        StringBuilder result = emphasize(phrase, 'a');
	        System.out.println(result);
	}
}
