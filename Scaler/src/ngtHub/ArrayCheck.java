package ngtHub;

public class ArrayCheck {
	public static void main(String[] args) {
		
		
		A[] a, a1;
		B[] b;
		a = new A[10]; a1= a;
		b = (B[]) a;
		b = (B[]) a1;
	}
}


class A {}
class B extends A{}