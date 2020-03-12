package com.hrishi.datastructures;

import java.util.Arrays;
import java.util.Iterator;

import com.hrishi.datastructures.iterators.DynamicArrayIterator;

public class DynamicArray<T> implements Iterable<T> {
	
	Object[] data;
	int size;

	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}
	
	public int getSize() {
		return data.length;
	}
	
	public T get(int index) {
		return (T) data[index];
	}

	public void put(Object value) {
		if(size < getSize()) {
			data[size] = value;
			size++;
		} else {
			data = Arrays.copyOf(data, getSize()*2);
			data[size] = value;
			size++;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new DynamicArrayIterator<T>(this);
	}
}
