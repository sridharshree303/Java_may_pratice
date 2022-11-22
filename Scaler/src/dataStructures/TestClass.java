package dataStructures;

class Basee{
	public Object getValue() { return new Object();}
}

class Base2 extends Basee {
	public String getValue() {return "hello";}
}

class StringWrapper{
	private
	String theVal;
	
	public StringWrapper(String str) {
		this.theVal = str;
	}

	@Override
	public String toString() {
		return "StringWrapper [theVal=" + theVal + "]";
	}
}

public class TestClass
{
	public static void main(String[] args) {
		//Basee b = new Base2();
		//System.out.println(b.getValue());
		StringWrapper sw = new StringWrapper("How are you?");
		StringBuilder sb = new StringBuilder("How are you?");
		System.out.println("Hello, "+sw.toString());
		
		System.out.println("Hello, "+sb);
		
		//------------------------------------------------------------
		String s = "MINIMUM";
		System.out.println(s.substring(4,7));
		System.out.println(s.substring(5));
		System.out.println(s.substring(s.indexOf('I'),3));
		System.out.println(s.substring(s.indexOf('I'),4));
		
	}
}
