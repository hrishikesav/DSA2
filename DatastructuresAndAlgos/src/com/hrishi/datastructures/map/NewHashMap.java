package com.hrishi.datastructures.map;

public class NewHashMap<K,V> {

    final class Entry<K,V> {
        final K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    static int CAPACITY = 10;

    private Entry<K,V>[] entries;

    public NewHashMap() {
        this(CAPACITY);
    }

    public NewHashMap(int capacity) {
        CAPACITY = capacity;
        entries = new Entry[CAPACITY];
    }

    public void put(K key, V value) {
        for(int i=0; i< entries.length; i++) {
            if(entries[i].getKey().equals(key)) {
                entries[i].setValue(value);
            }
        }
    }

    public V get(K key) {
        V returnVal = null;
        for(int i=0; i< entries.length; i++) {
            if(entries[i].getKey().equals(key)) {
                returnVal = entries[i].getValue();
            }
        }
        return returnVal;
    }

}
