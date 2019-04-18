package main.java;


/*
 * Running Threads in Sequential order.
*/


public class PrintSquential implements Runnable {

	static int count = 1;
	static Object lock = new Object();
	int r;
	private String threadName;

	public PrintSquential(String name, int r) {
		this.threadName = name;
		this.r = r;
	}

	@Override
	public void run() {

		while (count<31) {

			synchronized (lock) {

				while (count % 3 != r) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				System.out.println(" Thread " + threadName +" "+ count);
				count++;
				lock.notifyAll();

			}

		}

	}

}
