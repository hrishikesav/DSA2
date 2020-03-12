package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.printValues();
		
		list.delete();
		System.out.println("After delete-------------------");
		
		list.printValues();
	}

}
