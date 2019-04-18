package com.java.threads;

public class TPrint {

	public static void main(String[] args) throws InterruptedException {
		
		T t1 = new  T(1);
		T t2 = new  T(2);
		T t3 = new  T(0);
         Thread th1 = new Thread (t1,"t1");
         Thread th2 = new Thread (t2,"t2");
         Thread th3 = new Thread (t3,"t3");
         
      
         th1.start();
         
         th2.start();
         
         th3.start();
		
	}

}
