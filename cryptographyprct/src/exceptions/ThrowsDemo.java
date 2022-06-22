package exceptions;

public class ThrowsDemo {

	public static int dividenum(int num,int num2) {
		return num/num2;
	}
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(dividenum(10, 0));
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		System.out.println("End");
	}
}
