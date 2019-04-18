package main.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Running Threads in Sequential order using Executor Services.
*/



public class MainRunningClass {

	public static void main(String[] args) throws InterruptedException {

		
		 ExecutorService exe = Executors.newFixedThreadPool(3);
		
		 exe.execute(new PrintSquential("T1", 1));
		 exe.execute(new PrintSquential("T2", 2));
		 exe.execute(new PrintSquential("T3", 0));
		 
		exe.shutdown();
	}

}
