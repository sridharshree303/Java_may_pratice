package java_math;

import java.math.BigInteger;

public interface BigIntegerDemo {
	public static void main(String[] args) {
		long x = (long) Math.pow(10, 20);
		System.out.println(x); //9223372036854775807
		
		BigInteger a = new BigInteger("534873873747");
		BigInteger aa = new BigInteger("534873873747");
		BigInteger b = new BigInteger("1032343899203");
		
		System.out.println(a); //59338923929329392
		System.out.println(b); //101032893929320939929203
		
		BigInteger m = new BigInteger("10");
		BigInteger n = new BigInteger("7");
		
		BigInteger c = m.add(n);
		BigInteger d = m.subtract(n);
		BigInteger e = m.multiply(n);
		BigInteger f = m.divide(n);
		BigInteger g = m.mod(n);
		BigInteger h = m.remainder(n);
		BigInteger i = m.max(n);
		BigInteger j = m.pow(2);
		
		System.out.println(c); //17
		System.out.println(d); //3
		System.out.println(e); //70
		System.out.println(f); //1
		System.out.println(g); //3
		System.out.println(h); //3
		System.out.println(i); //10
		System.out.println(j); //100
		
		//System.out.println(a.compareTo(aa)); //0
		//System.out.println(a.compareTo(b)); //-1
		
		//type conversion
		long xx = 50;
		BigInteger bb= new BigInteger(xx+"");
		System.out.println(bb); //50
		
		//intValue() conversion
		BigInteger b2 = new BigInteger("5342322328833");
		BigInteger b3 = new BigInteger("5223233");
		int num1 = b2.intValue();
		int num2 = b3.intValue();
		long num3 = b2.longValue();
		
		System.out.println(num1); //1883615681 - due to size limits
		System.out.println(num2); //5223233- exact size printed
		System.out.println(num3); //5342322328833
		
	}
}
