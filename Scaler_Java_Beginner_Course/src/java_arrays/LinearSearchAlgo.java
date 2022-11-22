package java_arrays;

import java.util.Scanner;

//Given an array and a key value as input.
//find the index of the key in the array.
//Return -1 if it is not present

//sample input
// n = 5
// 10,20,30,40,50
// 40
// ans = 3 index
public class LinearSearchAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int ans = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				ans = i;
				//break;
			}
			//System.out.println(i);
		}
		System.out.println(ans);
	}
}
