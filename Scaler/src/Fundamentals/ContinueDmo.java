package Fundamentals;

public class ContinueDmo {
	public static void main(String[] args) {
		for(int x=0;x < 10;x++) {
			if(x == 7) {
				System.out.println(x);
				break;
			}
			if(x >= 4) {
				System.out.println(x);
				continue;
			}
		}
	}
}
