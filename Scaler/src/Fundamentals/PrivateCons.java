package Fundamentals;


class Base{
	private Base(){
		System.out.println();
	}
}
public class PrivateCons {
	
	private PrivateCons() {
		super();
		System.out.println("Main class");
	}
	
	public static void main(String[] args) {
		new  PrivateCons();
	}
}
