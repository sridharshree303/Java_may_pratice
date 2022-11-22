package dataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 0, 5, 8, 9));
		System.out.println(search(arr, 4));
	}

	public static int search(final List<Integer> A, int B) {
		if (A.contains(B)) {
			for (int i = 0; i < A.size(); i++) {
				if (B == A.get(i))
					return i;
			}
		}
		return -1;
		/*
		 * @for binarySearch
		 * 
		 * if(A.contains(B)) { int low = 0; int high = A.size()-1; int mid = 0;
		 * 
		 * while(low <= high) { mid = low + ((high-low)/2); if(A.get(mid) < B) { high =
		 * mid-1; }else if(A.get(mid)>B) { low = mid+1; }else { return mid; } } } return
		 * -1;
		 */
	}
}
