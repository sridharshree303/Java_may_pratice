package exceptions;

public class ThrowDemo {
	static void checkEligibilty(int age) {
		if(age<18) {
			throw new CanVoteException("You are minor");
		}else {
			System.out.println("Vote for India.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Election....");
		
		try {
			checkEligibilty(16);
		}catch(CanVoteException cv) {
			System.out.println(cv.getMessage());
		}finally {
			System.out.println("End");
		}
	}
}
