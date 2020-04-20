package com.hrishi.problems.list;

import com.hrishi.datastructures.LinkedList;
import com.hrishi.datastructures.common.Node;

public class DeleteNode {

	public static void main(String[] args) {

		/*
		 * Cannot delete the tail node by this method.
		 * Instead of traversing through the whole list,
		 * copy the value and next node details to the 
		 * to be delete node.
		 */
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.printValues();
		
		Node toDelete = list.head.next.next;
		
		System.out.println("\nTo delete node with value = " +toDelete.value);
		
		Node next = toDelete.next;
		toDelete.value = next.value;
		toDelete.next = next.next;
		
		list.printValues();
	}

}
