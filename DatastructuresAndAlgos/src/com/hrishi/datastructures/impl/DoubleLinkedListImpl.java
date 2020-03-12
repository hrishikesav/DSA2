package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.DoubleLinkedList;

public class DoubleLinkedListImpl {

	public static void main(String[] args) {
		
		DoubleLinkedList<String> dList = new DoubleLinkedList<String>();
		
		dList.add("Hello");
		dList.add("Morning");
		dList.add("Evening");
		
		dList.printValues();
		
		System.out.println("After delete...");
		
		dList.delete();
		
		dList.printValues();
	}

}
