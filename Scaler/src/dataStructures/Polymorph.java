package dataStructures;

public class Polymorph {
	
	int x;
	int y;
	int z;
	double d;

	Polymorph() {
		System.out.println("default");
	}

	Polymorph(int x, int y) {
		System.out.println("x and y");
	}

	Polymorph(int x, double d) {
		System.out.println("x and d");
	}
	
	Polymorph(int x,int y,int z, double d){
		System.out.println("a, y, z and d");
	}
	
	public static void main(String[] args) {
		new Polymorph();
		new Polymorph(10,20);
		new Polymorph(10,10.5);
		new Polymorph(10,20,30,20.5);
	}
}
