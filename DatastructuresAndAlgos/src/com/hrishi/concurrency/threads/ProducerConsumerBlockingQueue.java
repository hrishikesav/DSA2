package com.hrishi.concurrency.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	
	public static void main(String[] args) {

		Thread producer = new Thread(() ->  {
			while(true) {
				try {
					Random random = new Random();
					queue.put(random.nextInt());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(() -> {
			while(true) {
				try {
					System.out.println(queue.take());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}

}
