
package java_arrays;

import java.util.Arrays;

public class MultiDimArray {
	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;

		// initialising multi array
		int arr1[][] = new int[rows][cols];

		arr1[1][2] = 40;
		//System.out.println(arr1[1][2]); //40

		// one more example
		int[][] arr = { { 2, 6, 3 }, { 8, 4, 3, 5 }, { 3, 6, 1, 4 } };

		//System.out.println(arr[2][2]); // 1

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			// System.out.print(Arrays.toString(arr[i]));
			System.out.println("");
		}
	}
}
