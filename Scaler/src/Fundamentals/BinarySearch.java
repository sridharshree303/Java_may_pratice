package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>(
				Arrays.asList(24, 33, 13, 11, 28, 19, 8, 30, 25, 42, 6, 30, 48, 3, 47, 24, 13, 3, 50));
		System.out.println(binary(obj,50));
	}
	
	public static ArrayList<Integer> sorting(ArrayList<Integer> A) {
		int n = A.size();
		for (int i = 1; i < n; i++) {
			int index = i;
			while (index >= 1 && A.get(index - 1) > A.get(index)) {
				int prev = A.get(index - 1);
				int value = A.get(index);
				A.set(index, prev);
				A.set(index - 1, value);
				if (index > 0)
					--index;
			}
		}
		return A;
	}

	public static int binary(ArrayList<Integer> obj, int n) {
	
		int l = 0;
		int h = obj.size()-1;
		int mid = 0;
		ArrayList<Integer> arr = sorting(obj);
		System.out.println(arr);
		
		while(l <= h) {
			mid = l + ((h-l)/2);
			if(arr.get(mid) < n) {
				l = mid+1;
			}else if(arr.get(mid) > n) {
				h = mid -1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
