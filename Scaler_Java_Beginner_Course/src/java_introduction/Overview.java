package java_introduction;

public class Overview {

	public static void main(String[] args) {
		int x = 3;
		int fact = factorial(x);
		System.out.println(fact);
	}
	
	//stackoverflow error example
	public static int factorial(int x) {
		if(x==0) {
			return 1;
		}
		System.out.println(x);
		return x*factorial(x-1);
	}
}

// Both compiled and Intrepreted language
// Source Code -> Compiler -> byte code -> JVM -> Machine code
// Platform-independent programming language.
// Object oriented, Class based, Concurrent (Multi Threading)

// Platform Independent
// Secure
// Simple
// Object-Oriented
// Portable
// Robust
// Architecture neutral (WORA)

// Garbage Collector
// Within Java, the programmers cannot delete the objects. 
// Hence, to delete or recollect a memory, JVM has a Garbage Collector.

// Object-Oriented-Programming :
// --> Inheritance
// --> Polymorphism
// --> Abstraction
// --> Encapsulation

// Stack memory --> Funtional calls and primitive data values
// Heap memory  --> Objects at runtime



