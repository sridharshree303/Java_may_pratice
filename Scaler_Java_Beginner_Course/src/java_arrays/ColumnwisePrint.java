package java_arrays;

import java.util.Scanner;
/*
 * input  - 5 4 2
 * 			3 9 5
 * 
 * output - 5 3
 * 			4 9
 * 			2 5
 */

public class ColumnwisePrint {
	
	public static void main(String[] args) {
		matrices();
	}
	
	public static void matrices() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows count : ");
		int rows = sc.nextInt();
		System.out.println("Enter the cols count : ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		for(int i=0;i < arr.length;i++) {
			for(int j=0;j < arr[i].length;j++) {
				System.out.print("Enter Numbers : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		// printing the scanning values
		for(int i=0;i < arr.length;i++) {
			for(int j=0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		// initializing an new array swapping the values
		int a[][] = new int[cols][rows];
		
		// assigning values to new array
		for(int i=0;i < arr.length;i++) {
			for(int j=0;j < arr[i].length;j++) {
				a[j][i] = arr[i][j];
			}
			//System.out.println();
		}
		
		//printing an array
		for(int i=0;i < a.length;i++) {
			for(int j=0;j < a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
