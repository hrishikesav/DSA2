package com.hrishi.datastructures.impl;

import com.hrishi.datastructures.HashTableArray;

public class HashTableArrayImpl {

	public static void main(String[] args) {

		HashTableArray<String> hash = new HashTableArray<String>(10);
		hash.put(12, "Ferrari");
		hash.put(13, "Mercedes");
		hash.put(14, "Renault");
		
		System.out.println("Val = " + hash.get(14));
	}

}
