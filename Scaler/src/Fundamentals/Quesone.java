package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class Quesone {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>(
				Arrays.asList(5,17,100,1));
		ArrayList<Integer> obj1 = new ArrayList<>(
				Arrays.asList(-98,54,-52,15,23,-97,12,-64,52,85));
//		System.out.println(methodOne(obj));
//		System.out.println(methodOne(obj1));
//		System.out.println(solve(obj1));
		
		ArrayList<Integer> obj2 = new ArrayList<>(
				Arrays.asList(1,2,3,2,1));
		System.out.println(solveTwo(obj2, 5));
//		ArrayList<Integer> obj3 = new ArrayList<>(
//				Arrays.asList(1,1,1));
//		System.out.println(solveTwo(obj3, 2));
	}
	
	
	
	public static int solveTwo(ArrayList<Integer> A, int B) {
		int pairs = 1;
		for(int i = 0; i< A.size();i++) {
			for(int j=i+1; j < A.size();j++) {
				int num1 = A.get(i);
				int num2 = A.get(j);
//				System.out.println(num1+"+"+ num2 );
				if(num1 + num2 == B) {
//					System.out.println("count "+pairs);
					pairs++;
				}
			}
		}
		return pairs;
	}
	
	
	
	
	public static int solve(ArrayList<Integer> A) {
		int even = Integer.MIN_VALUE;
		int odd = Integer.MAX_VALUE;
		
		for(int i=0;i < A.size();i++) {
			int num = A.get(i);
			if(num % 2 == 0)
			  even = Math.max(num, even);
			else
				odd = Math.min(num, odd);
		}
		return even-odd;
	}
	
	static int methodOne(ArrayList< Integer> A){
		int even = 0;
		int odd = 0;
		for(int i = 0; i < A.size();i++) {
			if(A.get(i) % 2 == 0) {
				even = even+A.get(i);
			}else if(!checkPrime(A.get(i))) {
				odd = odd+A.get(i);
			}
		}
		return even-odd;
	}
	static boolean checkPrime(int n) {
        int count = 0;
        if (n >= 0 && n < 2) 
        	return false;

        for (int i = 1; i <= n; i++) 
        { 
            if (n % i == 0) 
                count += 1; 
        } 

        if (count > 2)
            return false;
        else
            return true;
    }
}
