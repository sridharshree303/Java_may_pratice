package java_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransposeMatrix {
	
	public static void main(String[] args) {
		Integer[] a1 = {1, 2, 3};
		Integer[] a2 = {4, 5, 6};
		Integer[] a3 = {7, 8, 9};
		
		ArrayList<Integer> sublist = new ArrayList<>();
		sublist.addAll(Arrays.asList(a1));
		sublist.addAll(Arrays.asList(a2));
		sublist.addAll(Arrays.asList(a3));
		
		ArrayList<ArrayList<Integer>> list = 
				(ArrayList<ArrayList<Integer>>) Arrays.asList(sublist);
		
		System.out.println(solve(list));
	}
	
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
				// initializing an new array swapping the values
				ArrayList<Integer> nn = new ArrayList<>();
				
				// assigning values to new array
				for(int i=0;i < A.size();i++) {
					for(int j=0;j < A.get(i).size();j++) {
						System.out.print(A.get(i).get(j)+" ");
					}
					System.out.println();
				}
//				
//				//printing an array
//				for(int i=0;i < a.length;i++) {
//					for(int j=0;j < a[i].length;j++) {
//						System.out.print(a[i][j]+" ");
//					}
//					System.out.println();
//				}
		return null;
		
	}
}
