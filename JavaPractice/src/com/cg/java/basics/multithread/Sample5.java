package com.cg.java.basics.multithread;

class Sample5 implements Runnable {

	public void run() {
		synchronized (this) {
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
			this.notify();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
