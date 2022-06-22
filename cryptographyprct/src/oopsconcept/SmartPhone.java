package oopsconcept;

public class SmartPhone extends Phone {
	public void Internet() {
		System.out.println("Internet access");
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.Internet();
		sp.sms();
	}
}
