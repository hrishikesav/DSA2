package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.DynamicArray;

public class DynamicArrayImpl {

	public static void main(String[] args) {
		DynamicArray<Integer> dArray = new DynamicArray<Integer>();
		
		dArray.put(new Integer("5"));
		dArray.put(new Integer("15"));
		dArray.put(new Integer("52"));
		
		System.out.println("Size - " + dArray.getSize());
		
		for(Integer i : dArray) {
			System.out.println(i.intValue());
		}
	}

}
