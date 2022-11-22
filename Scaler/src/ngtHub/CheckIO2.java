package ngtHub;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CheckIO2 {
	public static void main(String[] args) throws IOException {
//		Console c = System.console();
//		if(c != null) {
//			c.writer().write('P');
//			c.writer().write('a');
//			c.writer().write('s');
//			c.writer().write('s');
//			c.writer().flush(); //t1
			
//			int i;
//			StringBuilder sb = new StringBuilder();
//			while((i = c.reader().read()) != 'x') {
//				sb.append((char)i);
//			}
//			c.writer().format("Result: %s", sb.toString());
//		}
		
//		HashSet<Integer> is = new HashSet<>();
//		is.add(100);
//		is.add(2000);
//		is.add(300);
//		is.add(400);
//		
//		Iterator<Integer> it = is.iterator();
//		
//		for(int i : is) {
//			System.out.println(it.next());
//		}
		
		ArrayDeque<Integer> aa = new ArrayDeque<>();
		aa.add(100);
		aa.add(200);
		//System.out.println(aa); // [100, 200]
		aa.addFirst(300);
		aa.addLast(400);
		//System.out.println(aa); //[300, 100, 200, 400]
		aa.offer(250);
		aa.offerFirst(50);
		//System.out.println(aa); //[50, 300, 100, 200, 400, 250]
		//System.out.println(aa.iterator().next()); // 50 - first element
		
//		aa.poll();
		//System.out.println(aa);  // [300, 100, 200, 400, 250]
//		aa.pop();
		//System.out.println(aa); // [100, 200, 400, 250]
		aa.push(255);
		aa.addLast(7347);  
		System.out.println(aa); // [255, 50, 300, 100, 200, 400, 250, 7347]
		aa.pop();
		System.out.println(aa); // // [50, 300, 100, 200, 400, 250, 7347]
		
		System.out.println(aa.peek()); // 50 -- it will show the head of the element
	}
}
