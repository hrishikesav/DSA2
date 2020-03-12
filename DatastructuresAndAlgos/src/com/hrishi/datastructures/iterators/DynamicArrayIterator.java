package com.hrishi.datastructures.iterators;

import java.util.Iterator;

import com.hrishi.datastructures.DynamicArray;

public class DynamicArrayIterator<T> implements Iterator<T> {

	DynamicArray<T> data;
	int index;
	
	public DynamicArrayIterator(DynamicArray<T> objects) {
		index = 0;
		data = objects;
	}
	
	@Override
	public boolean hasNext() {
		return data.get(index) != null;
	}

	@Override
	public T next() {
		T obj = data.get(index);
		index++;
		return obj;
	}

}
