package javabasics;

public class Loops {

	public static void main(String[] args) {
		int num = 100;
		System.out.println("List of Prime Numbers up to "+ num);
		for(int i = 2; i<num;i++) {
			int count = 2;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
