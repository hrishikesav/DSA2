package com.hrishi.datastructures.map;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class HashMap<T> {

    int size;
    int DEFAULT_START_SIZE = 10;
    T[] array;

    public HashMap() {
        this.size = DEFAULT_START_SIZE;
        this.array = (T[]) new Object[size];
    }

    public HashMap(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    public void put(int key, T value) {
        int index = hash(key);
        this.array[index] = value;
    }

    public T get(int key) {
        return this.array[key];
    }

    public int hash(int key) {
        return key;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
