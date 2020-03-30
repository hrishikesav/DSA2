package com.hrishi.concurrency.threads;

public class VolatileInThread {
	
	/*
	 * We are using a single object "mainThread" to invoke the two Runnable classes.
	 * 
	 * If we are using two different objects to invoke the two Runnable classes, then 
	 * "static" needs to be added to the "flag" variable declaration.
	 * <code>static volatile boolean flag = true;</code>
	 * 
	 */
	volatile boolean flag = true;

	public static void main(String[] args) {
		VolatileInThread mainThread = new VolatileInThread();
		
		Runnable runA = mainThread.new RunnableA();
		Thread tha = new Thread(runA);
		tha.start();
		
		Runnable runB = mainThread.new RunnableB();
		Thread thb = new Thread(runB);
		thb.start();
	}
	
	class RunnableA implements Runnable {
		@Override
		public void run() {
			System.out.println("RunnableA running.");
			flag = false;
		}
	}
	
	class RunnableB implements Runnable {
		@Override
		public void run() {
			System.out.println("RunnableB running.");
			while(flag) {
				System.out.println("RunnableB while");
			}
			System.out.println("RunnableB after while.");
		}
	}

}
