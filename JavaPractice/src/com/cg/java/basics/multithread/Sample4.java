package com.cg.java.basics.multithread;

public class Sample4 extends Sample5
{

	public static void main(String[] args) throws Exception {
		Sample5 ss = new Sample5();

		Thread tt = new Thread(ss);
		tt.start();
		synchronized (tt) {
			tt.wait();
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}	
		}
	}
}
