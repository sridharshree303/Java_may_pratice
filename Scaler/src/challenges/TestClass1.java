package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass1 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>(Arrays.asList("a","aa","aab","b","bb","bba","bbb"));
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("aa","aaab","ab","b"));
		String b = "bb";
		String c = "b";
		System.out.println(solve(ar,b));
		System.out.println(solve(arr,c));
	}
	
	public static ArrayList<Integer> solve(ArrayList<String> A, String B) {
		ArrayList<Integer> aa = new ArrayList<>();
		ArrayList<Integer> ab = new ArrayList<>() ;
		for(int i=0;i < A.size();i++) {
			if(A.get(i).startsWith(B)) {
				aa.add(i);
			}	
		}
		
		System.out.println(aa);
		if(aa.size() > 0) {
			ab.add(aa.get(0));
			ab.add(aa.get(aa.size()-1));
		}else {
			ab.add(-1);
			ab.add(-1);
		}
		return ab;
	}
}


//A = [a, aa, aab, b, bb, bba, bbb]
//B = bb

//[4, 6]