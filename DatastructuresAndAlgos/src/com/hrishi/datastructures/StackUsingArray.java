package com.hrishi.datastructures;

public class StackUsingArray<T> {

	Object[] array;
	int size;
	int top;
	
	public StackUsingArray(int size) {
		this.size = size;
		array = new Object[size];
		top = -1;
	}
	
	public void push(Object value) {
		if(!isStackFull()) {
			top++;
			array[top] = value;
		}
	}
	
	public T pop() {
		T val = null;
		if(!isStackEmpty()) {
			val = (T) array[top];
			top--;
		}
		return val;
	}
	
 	public Boolean isStackFull() {
		return (top == size-1);
	}
 	
 	public Boolean isStackEmpty() {
 		return (top == -1);
 	}

}
