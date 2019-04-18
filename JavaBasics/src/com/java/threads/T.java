package com.java.threads;

public class T implements Runnable {
	private static int i = 1;
	private int remainder;
	private static Object lock = new Object();

	public T(int r) {
		// TODO Auto-generated constructor stub
		this.remainder = r;
	}

	@Override
	public void run() {
		for (int j =1 ;j<11;j++){
			synchronized (lock) {

				while (i % 3 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " \t " + i);
				i++;
				lock.notifyAll();

			}

		}

	}

}
