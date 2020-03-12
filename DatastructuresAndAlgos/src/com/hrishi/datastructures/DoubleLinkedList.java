package com.hrishi.datastructures;

import com.hrishi.datastructures.common.DoubleNode;

public class DoubleLinkedList<T> {

	DoubleNode head;

	public DoubleLinkedList() {
		head = null;
		
	}
	
	public void add(Object value) {
		DoubleNode newNode = new DoubleNode(value, null,null);
		
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}
	
	public void delete() {
		head = head.next;
		head.previous = null;
	}
	
	public void printValues() {
		DoubleNode n = head;
		while(n != null) {
			System.out.println(n.value);
			n = n.next;
		}
	}

}
