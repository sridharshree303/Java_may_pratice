package oopsconcept;

//abstract demo

interface Sample{
	abstract void method1();
}
interface Dept{
	public abstract void method2(); 
}

abstract class User{
	abstract void username();
	
	void salary() {
		System.out.println("Salary credited");
	}
}
public class App extends User implements Sample,Dept {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1");
	}

	@Override
	void username() {
		// TODO Auto-generated method stub
		System.out.println("Sridhar");
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.method1();
		app.method2();
		app.username();
		app.salary();
	}

}
