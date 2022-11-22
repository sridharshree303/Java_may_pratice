package java_loops;

// write a program to generate random numbers between [1,10]
// and print them to the output.

//Terminate when you get 5

//skip all multiples of 4

public class RandomGame {
	public static void main(String[] args) {
     	randomGame();
		/*
     	int i = 0;
		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		*/ // 1,3,5,7,9
	}
	
	// Math.random() ==>  0 < x < 1
	public static void randomGame() {
		while(true) {
			int num = (int) (Math.random()*10)+1;
			if(num == 5)
				break;
			
			System.out.println(num + " ");
			if(num == 4) {
				System.out.println("Number is 4");
				continue;
			}
			
			if(num % 4 == 0) {
				System.out.println("Number is 8");
				continue;
			}
		}
	}
}
