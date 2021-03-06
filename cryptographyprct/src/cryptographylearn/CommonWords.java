package cryptographylearn;

public class CommonWords {

	public static void main(String[] args) {
		CommonWords cw = new CommonWords();
//		cw.testdecrypt();
//		cw.testhalfOfString();
		cw.testdecryptTwoKeys();
	}
	
	public int [] countLetters(String message) {
        int [] counters = new int [26];
        for (int i = 0; i < 26; i++) {
            counters[i] = 0;
        }
      
        String alph = "abcdefghijklmnopqrstuvwxyz";
        message = message.toLowerCase();
        for (int i = 0; i < message.length(); i++) {
            int position = alph.indexOf(message.charAt(i));
            if (position != -1) counters[position] += 1;
        }
        
        return counters;
    }
    
	public int maxIndex(int [] counters) {
        int maxcounter = 0;
        int maxposition = 0;
        for (int i = 0; i < counters.length; i++) {
            if (maxcounter < counters[i]) {
                maxposition = i;
                maxcounter = counters[i];
            }
        }
        return maxposition;
	}
    
	@SuppressWarnings("static-access")
	public String decrypt(String message) {
		Encrypttwo cc = new Encrypttwo();
        int[] freqs = countLetters(message);
        int maxDex = maxIndex(freqs);
        int dkey = maxDex-4;
        if (dkey < 0) dkey = 26 - (4 - maxDex);
        return cc.encrypt(message, 26-dkey);
	}
    
	@SuppressWarnings("static-access")
	public void testdecrypt() {
		Encrypttwo cc = new Encrypttwo();
        String message = cc.encrypt("Rpc ndj xbpvxct axut LXIWDJI iwt xcitgcti PCS rdbejitgh xc ndjg edrzti?", 11);
        message = decrypt(message);
        System.out.println(message);
        
	}


//	# Write the method halfOfString in the CaesarBreaker class that has two parameters, 
//	# a String parameter named message and an int parameter named start. 
//	# This method should return a new String that is every other character from message starting with the start position. 
//	# For example, the call halfOfString(?Qbkm Zgis?, 0) returns the String ?Qk gs? and the call halfOfString(?Qbkm Zgis?, 1) returns the String ?bmZi?.

	public String halfOfString(String message, int start) {
        String result = new String();
        for (int i = start; i < message.length(); i = i+2) {
            result = result + message.charAt(i);
        }
        return result;
    }
    
	public void testhalfOfString() {
        String message = "Qbkm Zgis";
        System.out.println(halfOfString(message, 1));
	}

//	# Write the method getKey in the CaesarBreaker class that has one parameter, a String s. 
//	# This method should call countLetters to get an array of the letter frequencies in String s and 
//	# then use maxIndex to calculate the index of the largest letter frequency, which is the location of the encrypted letter ?e?, 
//	# which leads to the key, which is returned.

	public int getKey(String s) {
        int [] freqs = countLetters(s);
        int maxDex = maxIndex(freqs);
        int dkey = maxDex-4;
        if (dkey < 0) dkey = 26 - (4 - maxDex);
        return dkey;
    }
    
//	# Write the method decryptTwoKeys in the CaesarBreaker class that has one parameter, 
//	# a String parameter named encrypted that represents a String that was encrypted with the two key algorithm discussed in the previous lesson. 
//	# This method attempts to determine the two keys used to encrypt the message, prints the two keys, 
//	# and then returns the decrypted String with those two keys. 

	@SuppressWarnings("static-access")
	public String decryptTwoKeys(String encrypted) {
		Encrypttwo cc = new Encrypttwo();
        String part_1 = halfOfString(encrypted, 0);
        String part_2 = halfOfString(encrypted, 1);
        
        int dkey2 = getKey(part_2);
        int dkey1 = getKey(part_1);
        
        System.out.println("The two keys are " + dkey1 + " and " + dkey2);
        
		String newinput1 = cc.encrypt(part_1, 26-dkey1);
        String newinput2 = cc.encrypt(part_2, 26-dkey2);
        
        int n1 = newinput1.length();
        int n2 = newinput2.length();
        String newinput = new String();
        if (n1 > n2) {
            for (int i = 0; i < n2; i++) {
                newinput = newinput + newinput1.substring(i, i+1);
                newinput = newinput + newinput2.substring(i, i+1);
            }
            newinput = newinput + newinput1.substring(n1-1, n1);
        }
        
        else if (n1 == n2) {
            for (int i = 0; i < n2; i++) {
                newinput = newinput + newinput1.substring(i, i+1);
                newinput = newinput + newinput2.substring(i, i+1);
            }
        }
        
        else if (n1 < n2) {
            for (int i = 0; i < n1; i++) {
                newinput = newinput + newinput1.substring(i, i+1);
                newinput = newinput + newinput2.substring(i, i+1);
            }
            newinput = newinput + newinput2.substring(n2-1, n2);
        }
        
        
        return(newinput);
    }
	
	private String decrptytwokey(String msg) {
		Encrypttwo cc = new Encrypttwo();
		String sd = cc.encryptTwokeys(msg, 14, 21);
		return sd;
	}
    
	public void testdecryptTwoKeys() {
//        CaesarCipher cc = new CaesarCipher();
//        FileResource fr = new FileResource();
//        String encrypted =fr.asString();
//        System.out.println(decryptTwoKeys(encrypted));
        
        String encrypted = "Ofz ktg urmlusq xnrj BUYTTGY ytj nzyqwzjf MSP otyugyqwe us dazd btopqy?";
        System.out.println(decryptTwoKeys(encrypted));
        System.out.println(decrptytwokey(encrypted));
          
    }
}

//a b c d e  f g h i j  k l m n o  p q r s t  u v w x y z 
