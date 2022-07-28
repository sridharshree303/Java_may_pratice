package com.cg.java.basics.multithread;

public class ThreadDemo1 extends Thread{
	
	public ThreadDemo1() {
		super("Sridhar1");
		start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
