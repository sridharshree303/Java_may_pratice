package sample;

public class Anagram {
	
	public String anagramCheck(String input1, String input2) {  
		char[] characters = input1.toCharArray(); 
		StringBuilder sb = new StringBuilder(input2);  
		for (char ch : characters){  
		  int index = sb.indexOf("" + ch);  
		  if (index != -1) {  
			  sb.deleteCharAt(index);  
		  }else{
			  boolean b1 = false;
			  String s1=String.valueOf(b1);
			  return s1;  
		  }  
		}
		if(sb.length() == 0) {
			boolean b2 = true;
			  String s2=String.valueOf(b2);
			  return s2; 
		}else 
			throw new UnsupportedOperationException("anagramCheck(String input1, String input2)");
	}  
	
	public static void main(String args[]){  
		Anagram n = new Anagram();
		System.out.println(n.anagramCheck("build", "dubli"));      
	}    
}
