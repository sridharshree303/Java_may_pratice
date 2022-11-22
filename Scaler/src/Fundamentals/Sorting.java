package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);list.add(4);list.add(3);list.add(1);list.add(5);
		System.out.println(solve(list, 3));

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(9);list1.add(4);list1.add(7);list1.add(1);list1.add(6);
		System.out.println(solve(list1, 7));

		ArrayList<Integer> obj = new ArrayList<>(
				Arrays.asList(24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50));
		
//		System.out.println(solve(obj, 13));
		System.out.println(solve1(obj, 13));

//		runtime checking
//		long start = System.currentTimeMillis();
//		new Sorting();
//		long end = System.currentTimeMillis();
//		System.out.println((end - start) + " ms");
	}

	public static int solve1(ArrayList<Integer> A, int B) {
		int ans = 0;
		if (!(A.contains(B)))
			return -1;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > B)
				++ans;
		}
		return ans;
	}

	public static int solve(ArrayList<Integer> A, int B) {

		int n = A.size();
		int count = 0;
		if (!(A.contains(B)))
			return -1;

		for (int i = 1; i < n; i++) {
			int index = i;
			while (index >= 1 && A.get(index - 1) > A.get(index)) {
				int prev = A.get(index - 1);
				int value = A.get(index);
				A.set(index, prev);
				A.set(index - 1, value);
				++count;
				if (index > 0)
					--index;
			}
		}
		
		System.out.println("Swaps count : " + count);
		System.out.println(A);
		int bIndex = A.lastIndexOf(B);
		int len = A.subList(++bIndex, n).size();
		return len;
	}
}
