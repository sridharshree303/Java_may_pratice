package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMod {
	
	// A[i] % A[j] maximum modulus in a array
	public static int solve(ArrayList<Integer> A) {
		ArrayList<Integer> Arr = A;
		int reminder, maxreminder = 0;
		for (int i : Arr) {
			for (int j : Arr) {
				try {
					if (i == j) {
						continue;
					} else {
						reminder = i % j;
					}

					if (reminder > maxreminder) {
						maxreminder = reminder;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		return maxreminder;
	}

	
	public static int solve1(ArrayList<Integer> A) {
		int evenCount = 0;
		int oddCount = 0;
		int totalCount = 0;
		int n = A.size() - 1;

		if (n == 0) {
			return totalCount;
		}

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) % 2 == 0) {
				evenCount += 1;
			} else {
				oddCount += 1;
			}
		}
		if (evenCount < oddCount) {
			totalCount = evenCount;
		} else {
			totalCount = oddCount;
		}

		return totalCount;
	}

	public static int solve2(ArrayList<Integer> A) {
		int n = 0, m = 0;
		for (int i = 0; i <= A.size() - 1; i++) {
			if (A.get(i) % 2 == 0) {
				n++;
			} else {
				m++;
			}
		}
		return n < m ? n : m;
	}

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>(
				Arrays.asList(24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 48, 3, 47, 24, 13, 3, 50));
		
		System.out.println(solve2(obj));
		System.out.println(solve1(obj));
		System.out.println(solve(obj));
	}
}
