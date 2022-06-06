package MultiThreading;

public class ThreadDemo extends Thread{

	public static void myLoop() {
		System.out.println("Start");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("End");
	}
	public void run() {
		this.myLoop();
	}
	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		obj.start();
	}
}
