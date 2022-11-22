package Fundamentals;

public class StringProblem1 {
	public static int solve(String A) {
        int count = 0;
        char str[] = A.toCharArray();
        int one = 0;
        int zero = 0;
        
        for(int i=0;i<str.length;i++) {
        	if(str[i]== '0') {
        		++zero;
        	}
        	if(str[i]== '1') {
        		++one;
        	}
        	if(one == zero) {
        		++count;
        		one = 0;
        		zero = 0;
        	}
        }
        return count;
    }
	
	public static String solve1(String A) {
		char str[] = A.toCharArray();
		String string = "";
	
		for(char vow : str) {
			if(vow == 'a'||vow =='e'||vow=='i'||vow=='o'||vow=='u'){
				string += vow;
			}
		}
		
		return string;
	}
	
	public static void main(String[] args) {
		System.out.println(solve("011100"));
		System.out.println(solve("00011011"));
		System.out.println(solve("11000101"));
		System.out.println(solve1("interviewbit"));
		System.out.println(solve1("sriedha"));
	
	}
}
