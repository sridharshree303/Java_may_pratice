package com.practice.studentsystem.service;

import org.springframework.stereotype.Service;

@Service
public class CeaserServiceImpl implements CeaserService {

	
//---------------------- --Random number generate from range------------------------
	
	@Override
	public int getRandNumber() {
		int min = 1,max=26;
		int num =  (int) (Math.random() * (max - min)+min);
		return num;
	}

	
	
//------------------------with one Key-----------------------------------------------
	
	@Override
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

	@Override
	public String decrypt(String message,int dkey) {
		int max = 26;
		int key = max-dkey;
		String msg = encrypt(message, key);
		return msg;
	}

//------------------------ With two keys --------------------------------------------------
	
	@Override
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
        
//        return("Keys are "+key1+","+key2+" --- "+newinput);
        return newinput;
	}
	
	@Override
	public String decrptytwokey(String msg, int n1, int n2) {
		String sd = encryptTwokeys(msg , 26-n1 ,26-n2);
		return sd;
	}
	

//----------------- decryption -------------------------------------------
	
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
	
//	@Override
//	public String decrypt(String message) {
//        int[] freqs = countLetters(message);
//        int maxDex = maxIndex(freqs);
//        int dkey = maxDex-4;
//        if (dkey < 0) dkey = 26 - (4 - maxDex);
//        return encrypt(message, 26-dkey);
//	}
	
	public String halfOfString(String message, int start) {
        String result = new String();
        for (int i = start; i < message.length(); i = i+2) {
            result = result + message.charAt(i);
        }
        return result;
    }
	
	public int getKey(String s) {
        int [] freqs = countLetters(s);
        int maxDex = maxIndex(freqs);
        int dkey = maxDex-4;
        if (dkey < 0) dkey = 26 - (4 - maxDex);
        return dkey;
    }

	@Override
	public String decryptTwoKeys(String encrypted) {
        String part_1 = halfOfString(encrypted, 0);
        String part_2 = halfOfString(encrypted, 1);
        
        int dkey2 = getKey(part_2);
        int dkey1 = getKey(part_1);
        
        System.out.println("The two keys are " + dkey1 + " and " + dkey2);
        
		String newinput1 = encrypt(part_1, 26-dkey1);
        String newinput2 = encrypt(part_2, 26-dkey2);
        
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
}
