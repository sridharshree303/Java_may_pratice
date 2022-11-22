package dataStructures;

import java.io.IOException;

interface Inter{
	void meth() throws IOException;
}

class Ab implements Inter{

	public void meth() throws RuntimeException {
		System.out.println("Ab");
		
	}
}

public class CheckingStringLen {
	public static void main(String[] args) {
		//strLength();
		Ab ab = new Ab();
		ab.meth();
	}
	
	
	
//	public static int strLength() {
//		String blank = " ";
//		String line = blank+"Hello"+blank+blank;
////		System.out.println(line);
//		line.concat("world");
////		System.out.println(line);
//		String newLine = line.trim();
//		System.out.println(newLine);
//		System.out.println(line.length());
//		System.out.println(newLine.length() +" == "+ line.length());
//		return 0;
//	}
}
