package ngtHub;

public class UserDefinedExceptionDemo {
	public static void main(String[] args) throws ValidException {
		System.out.println(isValid(50));
	}
	
	public static String isValid(int data) throws ValidException {
		int passMarks = 35;
		if(passMarks > data) {
			throw new ValidException("Failed");
		} else if(passMarks < data) {
			return "passed";
		}else 
			return "Not valid marks";
	}
}
