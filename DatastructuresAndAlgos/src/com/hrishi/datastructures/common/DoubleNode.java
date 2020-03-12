package com.hrishi.datastructures.common;

public class DoubleNode {

	public Object value;
	public DoubleNode next;
	public DoubleNode previous;

	public DoubleNode(Object value, DoubleNode next, DoubleNode previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

}
