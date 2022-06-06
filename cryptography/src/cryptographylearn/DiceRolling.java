package cryptographylearn;

import java.util.Random;

public class DiceRolling {

	public static void main(String[] args) {
		DiceRolling dr = new DiceRolling();
		dr.simulate(1000);
	}

	public void simulate(int rolls) {
		Random ran = new Random();
		int[] counts = new int [13];
		
		for(int k=0; k<rolls;k++) {
			int d1 = ran.nextInt(6)+1;
			int d2 = ran.nextInt(6)+1;
			counts[d1+d2] += 1;
		}
		
		for(int k=2; k<=12; k++){
			System.out.println(k+"'s\t "+counts[k]);
		}
	}
}
