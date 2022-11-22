package pluralsite.arrays;

import java.util.StringTokenizer;

public class ArrayDemo {

	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		int[] arr = new int[5];

		int[] arr1 = { 100, 200, 300, 400, 500 };

		for (int a : arr1) {
			System.out.println(a);
		}

		// two dimensional
		int[][] arr2 = { { 525, 2783, 273, 983 }, { 773, 838, 9499, 399, 3847 }, { 883, 389, 933 } };
		System.out.println(arr2[1][2]); // 9499

		System.out.println(y);
		System.out.println(new ArrayDemo().x);

		
	}
}
