package java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] aa = new int[5];
		
		for(int i=0;i<aa.length;i++) {
			aa[i] = sc.nextInt();
		}
		System.out.println(aa);  //object
		System.out.println(Arrays.toString(aa)); // [values]
	}
}
