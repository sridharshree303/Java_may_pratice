package javabasics;

public class MethodOverload {
	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		mo.method(10, 15.0);
		mo.method(10,20);
	}
	public void method(int a,int b) {
		System.out.println(a+b);
	}
	public void method(int c,double d) {
		System.out.println(c+d);
	}
}
