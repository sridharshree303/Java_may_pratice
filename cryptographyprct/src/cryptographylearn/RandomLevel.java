package cryptographylearn;

public class RandomLevel {
	public static void main(String[] args) {
		
			int x = getRandomNumber(1, 26);
			System.out.print(x+" ");
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)+min));
	}
}
