package exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("hELLO WORLD");
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e){
			System.out.println(e.getStackTrace());
		}
		catch(Exception ee) {
			System.out.println(ee.getMessage());
		}
		finally {
			System.out.println("End");
		}
		sc.close();
	}
}
