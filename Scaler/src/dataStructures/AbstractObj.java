package dataStructures;

//abstract -- incomplete
// concrete -- complete
interface Samp{
	void menu();
}
interface Sam extends Samp{
	 public void demo();
}

class Sridhar{
	void ram() {
		System.out.println(" ");
	}
}

abstract class Jd extends Sridhar {
	abstract void jsd();
}

abstract class Base extends Jd implements Sam  {
	public Base() {
		System.out.println("Constructor Base");
	}
	public void display() {
		System.out.println("Display method");
	}
	public abstract void baseDisp();
}

//--------------------------------------------------------------------

public class AbstractObj extends Base {
	
	public void displayone() {
		System.out.println("private");
	}
	@Override
	public void baseDisp() {
		System.out.println("BaseClass abstract method");
	}
	public static void main(String[] args) {
		Base bb = new AbstractObj();
		bb.baseDisp();
		bb.display();
		
		AbstractObj aa = new AbstractObj();
		aa.baseDisp();
		aa.displayone();
		aa.display();
	}
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void jsd() {
		// TODO Auto-generated method stub
		
	}
}
