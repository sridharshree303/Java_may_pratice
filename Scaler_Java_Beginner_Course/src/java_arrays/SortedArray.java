
package java_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(2);
		System.out.println(solve(arr));
		
		// array mutation
		int aa[] = {1,2,3,4,5};
		aa[3]=10;
		System.out.println(Arrays.toString(aa));
		
		//check the value 
		int[] arr1 = {0, 2, 4, 8, 3};
		for(int i = 0; i < arr1.length; i++) {
		    arr1[i] = arr1[(arr1[i] + 4) % arr1.length];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[2]); // 8
	}
	public static int solve(ArrayList<Integer> A) {
        for(int i = 0;i < A.size()-1;i++){
             if(A.get(i) > A.get(i+1)){
                  return 0;
             }
        }
        return 1;
   }
}
