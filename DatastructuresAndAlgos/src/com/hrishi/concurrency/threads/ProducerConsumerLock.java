package com.hrishi.concurrency.threads;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerLock {
	
	static int size = 4;
	static Queue<Integer> queue = new ArrayBlockingQueue<>(size);
	
	static Lock lock = new ReentrantLock(true);
	static Condition notEmpty = lock.newCondition();
	static Condition notFull = lock.newCondition();

	public static void main(String[] args) {
		
		Thread producer = new Thread(() ->  {
			while(true) {
				lock.lock();
				if(queue.size() == size) {
					try {
						notFull.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				queue.add(new Random().nextInt());
				notEmpty.signalAll();
				lock.unlock();
			}
		});
		
		Thread consumer = new Thread(() -> {
			while(true) {
				lock.lock();
				if(queue.isEmpty()) {
					try {
						notEmpty.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(queue.poll());
				notFull.signalAll();
				lock.unlock();
			}
		});
		
		producer.start();
		consumer.start();
		
	}

}
