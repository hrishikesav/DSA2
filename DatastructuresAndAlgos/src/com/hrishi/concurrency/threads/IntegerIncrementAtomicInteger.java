package com.hrishi.concurrency.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerIncrementAtomicInteger {
	
	AtomicInteger counter = new AtomicInteger(0);

	public static void main(String[] args) {
		IntegerIncrementAtomicInteger mainThread = new IntegerIncrementAtomicInteger();
		
		/*
		 * We cannot be sure whether tha or thb will print numbers.
		 * AtomicInteger gives support for atomic operations.
		 * It does not give support of what "synchronized" key word does.
		 */
		Runnable runA = mainThread.new RunnableA();
		Thread tha = new Thread(runA);
		tha.start();
		
		Runnable runB = mainThread.new RunnableB();
		Thread thb = new Thread(runB);
		thb.start();
		
		new Thread(() ->  {
			System.out.println("Just checking out. THE END");
		}).start();
	}
	
	class RunnableA implements Runnable {
		@Override
		public void run() {
			while(counter.get() < 15) {
				System.out.println("RunnableA AtomicInteger counter = " + counter.incrementAndGet());
			}
		}
	}
	
	class RunnableB implements Runnable {
		@Override
		public void run() {
			while(counter.get() < 15) {
				System.out.println("RunnableB AtomicInteger counter ==== " + counter.incrementAndGet());
			}
		}
	}

}