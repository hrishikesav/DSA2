package com.hrishi.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class InsertRemoveRandomValue {

    static Map<Integer,Integer> map = new HashMap<>();
    static int[] arr = new int[10];
    static int count = 0;

    public static void main(String[] args) {
        insert(10);
        insert(12);
        insert(15);
        insert(5);
        printArr();
        remove(10);

        System.out.println(randomVal());
        printArr();
    }

    static void printArr() {
        for(int c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void insert(int val) {
        if(!map.containsKey(val)) {
            arr[count] = val;
            map.put(val, count);
            count++;
        }
    }

    public static void remove(int val) {
        if(map.containsKey(val)) {
            int eleIndex = map.get(val);
            int lastIndex = count-1;
            int temp = arr[eleIndex];
            arr[eleIndex] = arr[lastIndex];
            arr[lastIndex] = 0;
            map.remove(val);
            map.put(val, eleIndex);
            count--;
        }
    }

    public static int randomVal() {
        int random = ThreadLocalRandom.current().nextInt(0, count);
        return arr[random];
    }
}
