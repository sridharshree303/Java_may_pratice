package javabasics;

class Employee{
	public Employee() {
		int salary = 40000;
		String name = "sridhar";
		System.out.println(name+" salary is = "+salary);
	}
}

public class ConstructorDemo extends Employee{

	public static void main(String[] args) {
		ConstructorDemo cd =  new ConstructorDemo(10,20);
		ConstructorDemo ccd = new ConstructorDemo();
	}
	
	public ConstructorDemo() {
		System.out.println("Constructor Method");
	}
	
	public ConstructorDemo(int b,int c) {
		System.out.println(b+c);
	}
	
	static {
		
		System.out.println("Static Method");
	}
}
