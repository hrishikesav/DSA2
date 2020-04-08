package com.hrishi.problems.list;

import com.hrishi.datastructures.LinkedList;
import com.hrishi.datastructures.common.Node;;

public class ReverseSublistInSinglyLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(11);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(2);
		
		int start = 1; // sub series start
		int end = 3;   // sub series end
		
		reverseLinkedList(list,start,end);
		
		list.printValues();
	}
	
	static void reverseLinkedList(LinkedList<Integer> list, int start, int end) {
		
		if(start == end) {
			return;
		}
		
		Node head = list.head;
		Node sublistHead = head;
		int k =1;
		
		while(k++ < start) {
			sublistHead = sublistHead.next;
		}
		
		Node sublistIter = sublistHead.next;
		while(start++ < end) {
			Node temp = sublistIter.next;
			sublistIter.next = temp.next;
			temp.next = sublistHead.next;
			sublistHead.next = temp;
		}
	}

}
