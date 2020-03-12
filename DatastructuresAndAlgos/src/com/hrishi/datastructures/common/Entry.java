package com.hrishi.datastructures.common;

public class Entry {
	
	public int key;
	public Object value;
	public Entry next;

	public Entry(int key, Object value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public Entry() {
		next = null;
	}
	
	public int getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}

}
