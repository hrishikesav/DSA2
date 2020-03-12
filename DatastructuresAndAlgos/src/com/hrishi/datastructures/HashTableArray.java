package com.hrishi.datastructures;

import com.hrishi.datastructures.common.Entry;

public class HashTableArray<T> {
	
	Entry[] arrayHash;
	int size;

	public HashTableArray(int size) {
		this.size = size;
		arrayHash = new Entry[size];
		
		for(int i=0; i<size; i++) {
			arrayHash[i] = new Entry();
		}
	}

	public int getHash(int key) {
		return key%size;
	}
	
	public void put(int key, Object value) {
		int hashPosition = getHash(key);
		
		Entry arrayEntries = arrayHash[hashPosition];
		Entry newItem = new Entry(key,value); 
		newItem.next = arrayEntries.next;
		arrayEntries.next = newItem;
	}
	
	public T get(int key) {
		T value = null;
		int hashPosition = getHash(key);
		
		Entry arrayEntries = arrayHash[hashPosition];
		while(arrayEntries != null) {
			if(arrayEntries.getKey() == key) {
				value = (T) arrayEntries.getValue();
			}
			arrayEntries = arrayEntries.next;
		}
		return value;
	}
}
