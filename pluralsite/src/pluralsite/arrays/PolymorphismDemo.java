package pluralsite.arrays;

class Parent{
	String name;
	Parent(){
		//TODO default constructor
	}
	Parent(String name){
		this.name = name;
	}
	public void m1() {
		System.out.println(name);
	}
	
	public void m1(float y) {
		System.out.println(y);
	}
}
class Child extends Parent{
	Child(){
		super("Sridhar");
	}
	public void m1(boolean status) {
		System.out.println("This is "+status);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Parent demo = new Child();
		demo.m1();
		demo.m1(15.2f);
	}
}
