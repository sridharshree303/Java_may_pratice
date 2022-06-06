package exceptions;

class InvalidVoterException extends Exception{
	public InvalidVoterException(String s) {
		super(s);
	}
}

public class UserDefinedException {
	public void checkAge(int age) throws InvalidVoterException{
		if(age < 18) {
			throw new InvalidVoterException("Not eligible");
		}
	}
	
	public static void main(String[] args) {
		UserDefinedException ude = new UserDefinedException();
		try {
			ude.checkAge(17);
		}catch(InvalidVoterException ex) {
			System.out.println("Voter");
			System.out.println(ex.getMessage());
		}
	}
}
