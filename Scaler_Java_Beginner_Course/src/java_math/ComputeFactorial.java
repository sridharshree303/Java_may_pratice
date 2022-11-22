package java_math;

import java.math.BigInteger;

//Given an Integer N, compute its factorial
// Input = 5 
// Output = 120

public class ComputeFactorial {
	public static void main(String[] args) {
		System.out.println(factorial(1000));
	}
	
	public static BigInteger factorial(int x) {
		BigInteger ans = new BigInteger("1");
		for(int i=1; i <= x ; i++) {
			BigInteger temp = new BigInteger(i+"");
			ans = ans.multiply(temp);
		}
		String str = ans.toString();
		System.out.println(str.length());
		return ans;
	}
}
