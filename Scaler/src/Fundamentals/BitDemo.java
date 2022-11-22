package Fundamentals;

//super class
class BitDemoOne {
	static int num;
	static String name;
	public BitDemoOne(int num, String name) {
		this.num = num;
		this.name = name;
	}
}

//sub class
public class BitDemo extends BitDemoOne {
	int salary ;
	
	BitDemo(int num, String name, int salary ){
		super(num,name);
		this.salary = salary;
	}

	void printing() {
		System.out.println(num + " - "+ name);
	}
	
	public static void main(String[] args) {
		BitDemo bn = new BitDemo(101, "Sridar", 10000);
		bn.printing();
	}
}



