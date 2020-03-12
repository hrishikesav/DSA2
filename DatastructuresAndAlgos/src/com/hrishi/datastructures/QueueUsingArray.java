package com.hrishi.datastructures;

public class QueueUsingArray<T> {

	Object[] array;
	int size;
	int rear;
	int front;
	
	public QueueUsingArray(int size) {
		this.size = size;
		array = new Object[size];
		front = -1;
		rear = -1;
	}
	
	public void queue(Object value) {
		if(!isQueueFull()) {
			rear++;
			array[rear] = value;
			
			if(front == -1) {
				front = 0;
			}
		}
	}
	
	public T dequeue() {
		T val = null;
		if(!isQueueEmpty()) {
			val = (T) array[front];
			front++;
		}
		return val;
	}
	
 	public Boolean isQueueFull() {
		return (rear == size-1);
	}
 	
 	public Boolean isQueueEmpty() {
 		return (front == -1 || front > rear);
 	}

}
