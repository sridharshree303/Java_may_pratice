package com.cg.java.basics.multithread;

public class ThreadDemo2 extends Thread {

	public ThreadDemo2() {
		super("Sridhar2");
		start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
