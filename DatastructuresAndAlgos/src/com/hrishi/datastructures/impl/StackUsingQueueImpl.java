package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.StackUsingQueue;

public class StackUsingQueueImpl {

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println(stack.pop());

		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
