package com.cg.java.basics.multithread;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		Sample ss = new Sample();
	}
}


class Sample extends Thread{
	public Sample() {
		super("naresh");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Sridhar");
		System.out.println(Thread.currentThread().getName());
		start();
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

