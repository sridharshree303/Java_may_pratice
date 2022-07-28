package com.cg.java.basics.multithread;

public class Sample2 {
	public static void main(String[] args) {
		SampleTh ss = new SampleTh();
		for(int i= 1;i<= 10;i++) {
			Thread tt = new Thread(ss);
			tt.start();
		}
		
	}
}

class SampleTh extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public SampleTh() {
		super("sri");
		System.out.println(Thread.currentThread().getName());  // main	
	}
}
