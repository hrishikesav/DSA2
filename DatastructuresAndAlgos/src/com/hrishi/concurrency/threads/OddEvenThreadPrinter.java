package com.hrishi.concurrency.threads;

public class OddEvenThreadPrinter {

	static volatile int counter = 1;
	
	static final int max = 6;
	
	static OddEvenThreadPrinter object = new OddEvenThreadPrinter();
	
	public static void main(String[] args) {
		
		Thread oddThread = new Thread(() -> {
			while(counter < 6) {
				synchronized(object) {
					if(counter % 2 == 0) {
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Odd thread - " + counter);
					counter++;
					object.notifyAll();
				}
			}
		});
		
		Thread evenThread = new Thread(() -> {
			while(counter < 6) {
				synchronized(object) {
					if(counter % 2 != 0) {
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Even thread   - " + counter);
					counter++;
					object.notifyAll();
				}
			}
		});
		
		oddThread.start();
		evenThread.start();
	}

}
