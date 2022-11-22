package ngtHub;

import java.io.Console;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;

//interface sample{
//	String sample1();
//}
public class Sticker {
	String str ;
	
	public Sticker(String str) {
		
		this.str = str;
		
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int n = new Random().nextInt();
		System.out.println(n);
		return n;
	}
	
	public boolean equals(Sticker obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public static void main(String[] args) {
		Sticker ss = new Sticker("Sridhar");
		System.out.println(ss.hashCode());
	}


//	@Override
//	public String sample1() {
//		// TODO Auto-generated method stub
//		Consumer<String> aa = (String a )-> return this.str;
//	}
}
