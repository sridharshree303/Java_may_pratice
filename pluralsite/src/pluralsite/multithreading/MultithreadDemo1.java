package pluralsite.multithreading;

class DemoOne implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ee) {
			ee.printStackTrace();
		}

		System.out.println(
				"State of thread1 while it called join() method on thread2 -" + MultithreadDemo1.thread1.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class MultithreadDemo1 implements Runnable {

	public static MultithreadDemo1 obj = new MultithreadDemo1();
	public static Thread thread1 = new Thread(obj);
	

	public static void main(String[] args) {

		System.out.println("State of thread1 after creating it - " + thread1.getState());
		thread1.start();
	}

	@Override
	public void run() {
		DemoOne childThread = new DemoOne();
		Thread thread2 = new Thread(childThread);

		System.out.println("State of thread2 after creating it - " + thread2.getState());
		thread2.start();

		// thread2 moved to Runnable state
		System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState());

		try {
			// moving thread1 to timed waiting state
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 after calling .sleep() method on it - " + thread2.getState());

		
		try {
			// waiting for thread2 to die
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
	}

}
