package dataStructures;

import java.util.Objects;

class Test{
	public void display() {
		System.out.println("Test class method");
	}
}

class Sample extends Test {
	public void display() {
		System.out.println("Sample class method");
	}
}


public class MethodRiding {
	public static void main(String[] args) {
		Test ss = new Sample();
		ss.display();
//		MethodRiding pp = new MethodRiding("Sridhar");
//		System.out.println(pp.equals("Sridhar"));
	}
	
	private String name;
	public MethodRiding(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MethodRiding other = (MethodRiding) obj;
		return Objects.equals(name, other.name);
	}
	
	
}

//------------------------------------------------------
//interface Test{
//	public static void display() {
//		System.out.println("Test class method");
//	}
//}
//
//class Sample implements Test {
//	public static void display() {
//		System.out.println("Sample class method");
//	}
//}
//
//public class MethodRiding {
//	public static void main(String[] args) {
//		Test tt = new Sample();
//		Test.display();
//	}
//}
