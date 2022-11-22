package Fundamentals;

public class Fiboncci {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fiboncci(i) + " ");
		}

		System.out.println(fact(5));
		
		System.out.println(square(2, 100, 7));
	}

	// finding modulus (2^100)%2 = 0
	public static long square(int base, int power, int mod) {
		if (power == 0)
			return 1;
		else
			return ((base % mod) * (square(base, power - 1, mod)) % mod) % mod;
	}

	//factorial
	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	//fibonaci
	public static int fiboncci(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		else
			return (fiboncci(n - 1) + fiboncci(n - 2));

	}
}
