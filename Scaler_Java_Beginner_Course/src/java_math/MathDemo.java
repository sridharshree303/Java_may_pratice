package java_math;

public class MathDemo {
	public static void main(String[] args) {
		//max and min
		System.out.println(Math.max(10,2)); // 10
		System.out.println(Math.min(22, 2));// 2
		
		//rounding
		System.out.println(Math.floor(3.2)); // 3.0
		System.out.println(Math.ceil(23.3)); //24.0
		System.out.println(Math.round(32.4));//32
		System.out.println(Math.round(32.6));//33
		
		//Logs and Exponents
		double E = Math.E;
		System.out.println(E); //2.718281828459045
		
		double x = Math.log(E);
		double y = Math.log10(100);
		System.out.println(x); //1.0
		System.out.println(y); //2.0
		
		//power
		double a = Math.pow(3, 3);
		System.out.println(a); //27.0
		
		//squareroot
		double b = Math.sqrt(25);
		System.out.println(Math.cbrt(27));; //3
		System.out.println(b);	//5
		
		//Trignometry ratios
		final double PI = Math.PI;
		System.out.println(PI); //3.141592653589793
		
		//sin()
		System.out.println(Math.sin(PI/6)); //0.49999999999999994
		System.out.println(Math.sin(0)); //0.0
		
		//cos()
		System.out.println(Math.cos(PI/3)); //0.5000000000000001
		System.out.println(Math.cos(0));//1.0
		
		//tan()
		System.out.println(Math.tan(PI/4)); //0.999999999999999
	}
}








