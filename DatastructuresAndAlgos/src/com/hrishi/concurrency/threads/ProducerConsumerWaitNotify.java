package com.hrishi.concurrency.threads;

import java.util.Queue;import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerWaitNotify {
	
	static int size = 4;
	static Queue<Integer> queue = new ArrayBlockingQueue<>(size);
	
	static ProducerConsumerWaitNotify object = new ProducerConsumerWaitNotify();

	public static void main(String[] args) {

		Thread producer = new Thread(() -> {
			while(true) {
				synchronized(object) {
					if(queue.size() == size) {
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					queue.add(new Random().nextInt());
					object.notifyAll();
				}
			}
		});
		
		Thread consumer = new Thread( () -> {
			while(true) {
				synchronized(object) {
					if(queue.isEmpty()) {
						try {
							object.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(queue.poll());
					object.notifyAll();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}

}
