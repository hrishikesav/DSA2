package com.hrishi.datastructures;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {

	Queue<Integer> q1;
	Queue<Integer> q2;

	public StackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	public void push(int num) {
		q2.add(num);

		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		Queue<Integer> temp = new LinkedList<Integer>();
		temp = q2;
		q2 = q1;
		q1 = temp;

	}

	public int pop() {
		if (!q1.isEmpty()) {
			return q1.poll();
		}
		return -1;
	}

}
