package javabasics;

public class StaticBlocks {
	static {
		System.out.println("Static block");
	}
	StaticBlocks(){
		System.out.println("Constructor");
	}
	{
		System.out.println("Non-static Block");
	}
	public static void main(String[] args) {
		new StaticBlocks();
		
	}
}
