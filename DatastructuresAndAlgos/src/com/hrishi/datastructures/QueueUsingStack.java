package com.hrishi.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStack {

	Deque<Integer> d1;
	Deque<Integer> d2;

	public QueueUsingStack() {
		d1 = new ArrayDeque<Integer>();
		d2 = new ArrayDeque<Integer>();
	}

	public void enqueue(int num) {
		while (!d1.isEmpty()) {
			d2.push(d1.pop());
		}

		d1.push(num);

		while (!d2.isEmpty()) {
			d1.push(d2.pop());
		}
	}

	public int dequeue() {
		return d1.pop();
	}

}
