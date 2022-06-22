package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner ln = new Scanner(System.in);
		int a;
		a = ln.nextInt();
		int n = a+1;
		int[] arr = new int[n];
		for(int b =0;b < n;b++) {
			arr[b] = ln.nextInt();
		}
		
		Sample s = new Sample();
		s.ascDescArray(arr, n);
		
	}
	public void ascDescArray(int arr[],int n) {
		
		Arrays.sort(arr);
		
		int ar[] = new int[n];
		
		String msg = "Invalid Input";
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
					 for (int a = 0; a < n / 2; a++) {
					     ar[a] = arr[a];
					 }
						 
					 for (int j = n - 1; j >= n / 2; j--) {
						 ar[j] = arr[j];
					 }
					 
			}else {
				System.out.println(msg);
			}
		}
	}
	
}
