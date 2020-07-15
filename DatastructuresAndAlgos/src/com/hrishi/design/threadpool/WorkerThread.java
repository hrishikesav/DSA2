package com.hrishi.design.threadpool;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends Thread {
	
	BlockingQueue<Integer> queue;
	
	public WorkerThread(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}


	public void run() {
		while(true) {
			try {
				Integer num = queue.take();
				System.out.println("Processing number: " + num + " from thread: " + this.getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
