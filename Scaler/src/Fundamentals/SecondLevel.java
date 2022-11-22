package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SecondLevel {
	public static void main(String[] args) {
//		ArrayList<Integer> obj1 = new ArrayList<>(
//				Arrays.asList(2,1,4,10));
//		ArrayList<Integer> obj2 = new ArrayList<>(
//				Arrays.asList(3,6,2,10,10));
//		System.out.println(solve(obj1,obj2));
		
		System.out.println(power(-1, 3, 3));
	}
	
	public static int power(int A, int B, int C) {
		int num = (int) Math.pow(A, B);
		int result = num % C;
		return result;
    }
	
	static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<B.size();i++) {
			int num = B.get(i);
			if(A.contains(num)) {
				int indexA = A.lastIndexOf(num);
				int element = A.remove(indexA);
				list.add(element);
			}
		}
		Collections.sort(list);
		return list;
	}
}
