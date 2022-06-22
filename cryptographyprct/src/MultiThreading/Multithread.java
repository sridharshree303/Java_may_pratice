package MultiThreading;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class newThread extends Thread{
	Thread t;
	String name;
	newThread(String threadname){
		name = threadname;
		t = new Thread(this,name);
		t.start();
	}
	public void run() {
		
	}
}


public class Multithread {

	public static void main(String[] args) {
		newThread obj1 = new newThread("one");
		newThread obj2 = new newThread("two");
		try {
			obj1.t.wait();
			System.out.println(obj1.t.isAlive());
		}catch(Exception e){
			System.out.println("Main thread interuppetd");
		}
	}
	
}

