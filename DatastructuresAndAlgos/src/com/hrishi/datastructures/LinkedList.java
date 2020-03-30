package com.hrishi.datastructures;

import com.hrishi.datastructures.common.Node;

public class LinkedList<T> {
	
	public Node head;

	public LinkedList() {
		head = null;
	}
	
	public void add(Object value) {
		Node newNode = new Node(value, null);
		
		if(head == null) {
			head = newNode;
		} else {
			Node start = head;
			while(start.next != null) {
				start = start.next;
			}
			start.next = newNode;
		}
	}
	
	public void delete() {
		head = head.next;
	}
	
	public void printValues() {
		Node n = head;
		while(n != null) {
			System.out.print(n.value + " ");
			n = n.next;
		}
	}

}
