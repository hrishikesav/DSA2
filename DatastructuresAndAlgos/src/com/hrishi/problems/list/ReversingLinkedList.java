package com.hrishi.problems.list;

import com.hrishi.datastructures.LinkedList;
import com.hrishi.datastructures.common.Node;

public class ReversingLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		reverseLinkedList(list);
		
		list.printValues();
	}
	
	static void reverseLinkedList(LinkedList<Integer> list) {
		Node prev = null;
		Node current = list.head;
		Node next;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list.head = prev;
	}

}
