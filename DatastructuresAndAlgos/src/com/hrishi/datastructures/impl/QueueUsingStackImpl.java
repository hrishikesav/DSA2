package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.QueueUsingStack;

public class QueueUsingStackImpl {

	public static void main(String[] args) {

		QueueUsingStack q = new QueueUsingStack();
	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    
	    System.out.println(q.dequeue());
	    System.out.println(q.dequeue());
	    q.enqueue(5);
	    System.out.println(q.dequeue());
	    System.out.println(q.dequeue());
	    
	}

}
