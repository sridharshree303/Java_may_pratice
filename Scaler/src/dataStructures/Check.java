package dataStructures;

class super3 {
	int i=10;
	public super3(int num) {
		i = num;
	}
	protected void display() {
		System.out.println("Display protected");
	}
}
public class Check extends super3 {

	public Check(int num) {
		super(num);
	}
	public void EExe() {
		System.out.println(i);
	}
	
	protected void display() {
		System.out.println("Display public");
	}
	
	public static void main(String[] args) {
		Check o = new Check(50);
		super3 s = new Check(20);
		System.out.println(s.i);
		o.EExe();
	}
}
