package com.hrishi.concurrency.threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.Semaphore;

public class DiningPhilosopherExpert {
	
	/*
	 * Shared between P1 and P2
	 */
	static Semaphore lock12 = new Semaphore(1, true);
	
	/*
	 * Shared between P2 and P3
	 */
	static Semaphore lock23 = new Semaphore(1, true);
	
	/*
	 * Shared between P3 and P4
	 */
	static Semaphore lock34 = new Semaphore(1, true);
	
	/*
	 * Shared between P4 and P1
	 */
	static Semaphore lock41 = new Semaphore(1, true);

	public static void main(String[] args) {
		
		Thread p1 = new Thread(() -> {
			/*
			 * lock12 and lock41
			 */
			while(true) {
				if(lock12.tryAcquire()) {
					if(lock41.tryAcquire()) {
						System.out.println("P1 eating");
						try {
							Thread.sleep(5000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						lock41.release();
					}
					lock12.release();
				}
			}
		} );
		
		Thread p2 = new Thread(() -> {
			/*
			 * lock12 and lock23
			 */
			while(true) {
				if(lock23.tryAcquire()) {
					if(lock12.tryAcquire()) {
						System.out.println("P2 eating");
						try {
							Thread.sleep(5000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						lock12.release();
					}
					lock23.release();
				}
			}
		} );
		
		Thread p3 = new Thread(() -> {
			/*
			 * lock34 and lock23
			 */
			while(true) {
				if(lock34.tryAcquire()) {
					if(lock23.tryAcquire()) {
						System.out.println("P3 eating");
						try {
							Thread.sleep(5000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						lock23.release();
					}
					lock34.release();
				}
			}
		} );
		
		Thread p4 = new Thread(() -> {
			/*
			 * lock41 and lock34
			 */
			while(true) {
				if(lock41.tryAcquire()) {
					if(lock34.tryAcquire()) {
						System.out.println("P4 eating");
						try {
							Thread.sleep(5000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						lock34.release();
					}
					lock41.release();
				}
			}
		} );
		
		p1.setName("Philosopher 1");
		p1.start();
		
		p2.setName("Philosopher 2");
		p2.start();
		
		p3.setName("Philosopher 3");
		p3.start();
		
		p4.setName("Philosopher 4");
		p4.start();
		
		Thread monitorThread = new Thread(() -> {
			while(true) {
				ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
				long[] ids = mxBean.findDeadlockedThreads();
				if(ids != null) {
					ThreadInfo[] thInfos = mxBean.getThreadInfo(ids);
					for(ThreadInfo th : thInfos) {
						System.out.println(th.getThreadName() + " waiting for " + th.getLockName() + " from " + th.getLockOwnerName());
					}
				}
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		monitorThread.start();
	}

}
