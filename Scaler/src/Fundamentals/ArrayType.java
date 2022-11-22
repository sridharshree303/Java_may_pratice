package Fundamentals;

public class ArrayType {

	public static void ArayType() {
		int i = 1234567890;
		float f = i;
		System.out.println(f);
		System.out.println((int) f);
		System.out.println(i - (int)f);
	}
	
	public static void main(String[] args) {
		ArayType();
	}
}