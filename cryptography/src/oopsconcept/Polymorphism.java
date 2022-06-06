package oopsconcept;

public class Polymorphism {

	public void addnum(int x) {
		System.out.println(x);
	}
	public void addnum(int x,int y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Polymorphism pp = new Polymorphism();
		pp.addnum(100);
		pp.addnum(100,200);
	}
}
