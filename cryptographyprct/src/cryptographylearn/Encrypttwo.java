package cryptographylearn;

public class Encrypttwo {
		
		public static void main(String[] args) {
			Encrypttwo cn = new Encrypttwo();
			cn.testencryptTwoKeys();
//			cn.testencrypt();
			
		}
		public String encrypt(String input, int key) {
	        int n = input.length();
	        String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String shifted = original.substring(key, 26);
	        shifted = shifted + original.substring(0, key);
	        String newinput = new String();
	        for (int i = 0; i < n; i++) {
	            int position = original.indexOf(input.substring(i, i + 1));
	            if (position == -1) {
	                position = original.toLowerCase().indexOf(input.substring(i, i + 1));
	                if (position > -1) newinput = newinput + shifted.substring(position, position+1).toLowerCase();
	                else newinput = newinput + input.substring(i, i + 1);
	            }
	            else if (position > -1) newinput = newinput + shifted.substring(position, position+1);
	        }
	        return(newinput);
	    }
	    
		public void testencrypt() {
	        //FileResource fr = new FileResource();
	        //String message = fr.asSting();
	        String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
	        String result = encrypt(message, 15);
	        System.out.println("key is "+ 15 + "\n" + result);
		}
	    
//		# Write the method encryptTwoKeys that has three parameters, a String named input, and two integers named key1 and key2. 
//		# This method returns a String that has been encrypted using the following algorithm. 
//		# Parameter key1 is used to encrypt every other character with the Caesar Cipher algorithm, 
//		# starting with the first character, and key2 is used to encrypt every other character, 
//		# starting with the second character. For example, the call encryptTwoKeys(?First Legion?, 23, 17) should return ?Czojq Ivdzle?. 
//		# Note the ?F? is encrypted with key 23, the first ?i? with 17, the ?r? with 23, and the ?s? with 17, etc. 

		public String encryptTwokeys(String input, int key1, int key2) {
	        int n = input.length();
	        String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String shifted_even = original.substring(key1, 26);
	        shifted_even = shifted_even + original.substring(0, key1);
	        String shifted_odd = original.substring(key2, 26);
	        shifted_odd = shifted_odd + original.substring(0, key2);
	        
	        String newinput1 = new String();
	        String newinput2 = new String();
	        String newinput = new String();
	        
	        for (int i = 0; i < n; i= i + 2) {
	            int position = original.indexOf(input.substring(i, i + 1));
	            if (position == -1) {
	                position = original.toLowerCase().indexOf(input.substring(i, i + 1));
	                if (position > -1) newinput1 = newinput1 + shifted_even.substring(position, position+1).toLowerCase();
	                else newinput1 = newinput1 + input.substring(i, i + 1);
	            }
	            else if (position > -1) newinput1 = newinput1 + shifted_even.substring(position, position+1);
	        }
	        
	        for (int i = 1; i < n; i= i + 2) {
	            int position = original.indexOf(input.substring(i, i + 1));
	            if (position == -1) {
	                position = original.toLowerCase().indexOf(input.substring(i, i + 1));
	                if (position > -1) newinput2 = newinput2 + shifted_odd.substring(position, position+1).toLowerCase();
	                else newinput2 = newinput2 + input.substring(i, i + 1);
	            }
	            else if (position > -1) newinput2 = newinput2 + shifted_odd.substring(position, position+1);
	        }
	        
	        int n1 = newinput1.length();
	        int n2 = newinput2.length();
	        
	        if (n1 > n2) {
	            for (int i = 0; i < n2; i++) {
	                newinput = newinput + newinput1.substring(i, i+1);
	                newinput = newinput + newinput2.substring(i, i+1);
	            }
	            newinput = newinput + newinput1.substring(n1-1, n1);
	        }
	        
	        if (n1 == n2) {
	            for (int i = 0; i < n2; i++) {
	                newinput = newinput + newinput1.substring(i, i+1);
	                newinput = newinput + newinput2.substring(i, i+1);
	            }
	        }
	        
	        if (n1 < n2) {
	            for (int i = 0; i < n1; i++) {
	                newinput = newinput + newinput1.substring(i, i+1);
	                newinput = newinput + newinput2.substring(i, i+1);
	            }
	            newinput = newinput + newinput2.substring(n2-1, n2);
	        }
	        
	        return(newinput);
	    }
	    
		public void testencryptTwoKeys() {
//	        String message = "Hfs cpwewloj loks cd Hoto kyg Cyy.";
			String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
	        String result = encryptTwokeys(message, 12, 5);
	        System.out.println(result);
		}
	}


