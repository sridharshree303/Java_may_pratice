package java_introduction;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		float avg1 = getAvg(2,5,6,7,6,8);
		float avg2 = getAvg(2,8,3,7);
		
		System.out.println(avg1);
		System.out.println(avg2);
	}
	
	static float getAvg(float ...varArgs) {
		//System.out.println(varArgs.getClass().getSimpleName()); //float[]
		//System.out.println(varArgs.length); //6
		
		//System.out.println(Arrays.toString(varArgs)); //[2.0, 5.0, 6.0, 7.0, 6.0, 8.0]
		
		float total = 0;
		for(float num : varArgs) {
			total += num;
		}
		
		return total/varArgs.length;
	}
}
