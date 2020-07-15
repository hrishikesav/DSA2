package com.hrishi.design.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

	public static void main(String[] args) {
		
		int maxThreads = 5;
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5, true);
		
		for(int i=0; i<maxThreads; i++) {
			WorkerThread wth = new WorkerThread(queue);
			wth.setName(i+1 + " thread");
			wth.start();
		}
		
		Thread th = new Thread(new ProducerThread(queue));
		th.start();
	}

}
