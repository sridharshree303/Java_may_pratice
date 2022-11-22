package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class PonyMobilePhones {
	
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3,4,4,6));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(20,4,10,2));
		System.out.println(solve(A, B));
	}
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> sum = new ArrayList<>(A.size());
		ArrayList<Integer> ans = new ArrayList<>(B.size());
		sum.add(A.get(0));
        for(int i=0; i<A.size()-1; i++){
            sum.add(i+1,(sum.get(i)+A.get(i+1)));
        }
        System.out.println(sum);

        for(int i=0; i<B.size(); i++){
            int l = 0;
            int r = A.size()-1;
            int count =  0;
            while(l<=r){
                int m = (l+r)/2;
                System.out.println(l +" + "+r +" = "+ m);
                if(sum.get(m) == B.get(i)){
                    count = m+1;
                    break;
                }
                else if(sum.get(m) > B.get(i)){
                    r = m-1;
                }
                else{
                    l = m+1;
                    count = m+1;
//                    System.out.println("count : "+count);
                }
            }
            ans.add(i, count);
        }
        return ans;
	}
	
	public static String pony(int A) {
		
		if(A == 1)
			return "Ponny";
		else if(A == 2)
			return "Donny";
		else
			return "Ponny";
	}
}
