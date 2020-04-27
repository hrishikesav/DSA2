package com.hrishi.concurrency.threads;

public class DiningPhilosopher {
	
	/*
	 * Simplest possible dining philosopher :)
	 */

	static Object leftLock = new Object();
	static Object rightLock = new Object();
	
	public static void main(String[] args) {
		
		Thread p1 = new Thread(() ->   {
			while(true) {
				System.out.println("P1");
				synchronized(leftLock) {
					synchronized(rightLock) {
						System.out.println("P1 - eating");
						try {
							Thread.sleep(5000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		
		Thread p2 = new Thread(() ->   {
			while(true) {
				System.out.println("P2");
				synchronized(leftLock) {
					synchronized(rightLock) {
						System.out.println("P2 - eating");
						try {
							Thread.sleep(5000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		
		p1.start();
		p2.start();
	}

}
