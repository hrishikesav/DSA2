package com.hrishi.concurrency.threads;

public class IntegerIncrementInThreads {
	
	volatile int counter = 0;

	public static void main(String[] args) {
		IntegerIncrementInThreads mainThread = new IntegerIncrementInThreads();
		
		/*
		 * tha gets the lock first, so tha will print all the values.
		 * thb will never get a chance to print any values.
		 */
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
			synchronized(IntegerIncrementInThreads.class) {
				while(counter < 15) {
					counter++;
					System.out.println("RunnableA counter = " + counter);
				}
			}
		}
	}
	
	class RunnableB implements Runnable {
		@Override
		public void run() {
			synchronized(IntegerIncrementInThreads.class) {
				while(counter < 15) {
					counter++;
					System.out.println("RunnableB counter ==== " + counter);
				}
			}
		}
	}

}