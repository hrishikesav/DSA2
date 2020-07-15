package com.hrishi.design.threadpool;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {

	BlockingQueue<Integer> queue;

	public ProducerThread(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		Random random = new Random();

		while (true) {
			int num = random.nextInt(52);

			try {
				queue.put(num);
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
