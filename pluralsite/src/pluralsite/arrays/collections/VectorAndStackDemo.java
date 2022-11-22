package pluralsite.arrays.collections;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorAndStackDemo {

	public static void main(String[] args) {
		vectordemo();
//		statckDemo();
	}
	
	//stack demo
	public static void statckDemo() {
		 List<Integer> s = new Stack<Integer>();
		 s.add(100);
		 s.add(200);
		 s.add(300);
		 s.add(400);
		 s.add(500);
		 s.add(300);
		 s.remove(5);
		 System.out.println(s);
		 
	}
	
	//vector demo
	public static void vectordemo() {
		//Vector list = new Vector();
		Vector<Integer> list = new Vector<>();
		list.add(100);
		list.add(200);
		list.add(100);
		//list.add("Num");
		list.add(400);
		System.out.println(list.size());
		System.out.println(list);
		
		
	}
}
