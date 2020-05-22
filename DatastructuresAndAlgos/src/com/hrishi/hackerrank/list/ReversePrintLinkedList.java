package com.hrishi.hackerrank.list;

import com.hrishi.datastructures.LinkedList;
import com.hrishi.datastructures.common.Node;

public class ReversePrintLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		print(list.head);
	}

	static void print(Node head) {
		if (head != null) {
			printListReverse(head);
		}
	}

	static void printListReverse(Node node) {
		if (node.next != null) {
			printListReverse(node.next);
			System.out.println(node.value);
		} else {
			System.out.println(node.value);
		}
	}

}
