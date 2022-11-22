package pluralsite.multithreading;

public class MultithreadDemo {
	public static void main(String[] args) {
		
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			ExtendingClass ec = new ExtendingClass();
			ec.start();
		}

		System.out.println("==================================");

		ImplmentThread im = new ImplmentThread();
		int x = 8; // Number of threads
		for (int i = 0; i < x; i++) {
			Thread tt = new Thread(im);
			tt.start();
		}
	}

}

//Thread creation by implementing the Runnable Interface
class ImplmentThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}

}

//Thread creation by extending the Thread class
class ExtendingClass extends Thread {
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}
}
