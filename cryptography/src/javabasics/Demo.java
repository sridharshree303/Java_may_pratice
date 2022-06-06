package javabasics;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		boolean x = false;
		if(x){
			System.out.println("Passed");
		}else {
			System.out.println("fail");
		}
		int opt = 1;
		switch(opt) {
		case 1 :
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
			break;
		}
		
		int[] arr = new int[] {1,2,3,4,5,6};
		System.out.println("for loop");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n--------------------\nwhile loop ");
		int b = 1;
		while(b <= 4) {
			System.out.print(b+" ");
			b++;
		}
		System.out.println("\n--------------------\ndo while loop");
		
		int c = 1;
		do {
			System.out.print(c+" ");
			c++;
		}while(c<=5);
		
	}
}












