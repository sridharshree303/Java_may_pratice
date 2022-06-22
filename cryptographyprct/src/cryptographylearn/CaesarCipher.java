package cryptographylearn;

// converts message to  encrypted form with single key

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Sridhar Kolluru";
		System.out.println(encryption(msg.toLowerCase(),19));
	}

	public static String encryption(String input,int key) {
		//Make a StringBuilder with message (encrypted)
		StringBuilder encrypted = new StringBuilder(input);
		//write down the alphabet
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String alphabet = alpha.toLowerCase();
		//compute the shifted alphabet
		String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
		
		//Count from 0 to <length of encrypted, (call it i)
		for(int i =0; i < encrypted.length();i++) {
			//Look at the ith character of encrypted 
			char currChar = encrypted.charAt(i);
			//Find the index of currChar in the alphabet
			int idx = alphabet.indexOf(currChar);
			//If currChar is in the alphabet
			if(idx != -1) {
				//Get the idxth character of shiftedAlphabet
				char newChar = shiftedAlphabet.charAt(idx);
				//Replace the ith character of encrypted with newChar
				encrypted.setCharAt(i, newChar);
			}
		}
		
		return encrypted.toString();
	}
}
