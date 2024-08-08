package com.hrishi.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class SortQueueWithoutExtraSpace {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
        queue1.add(2);
        queue1.add(5);
        queue1.add(8);
        queue1.add(1);
        queue1.add(9);
        queue1.add(3);

        System.out.println("Before=" + queue1);
        int count=0;
        int originalCount = queue1.size();
        while(count < originalCount) {
            int min = Integer.MIN_VALUE;
            int innerCount = 0;
            while (innerCount < originalCount) {
                int current = queue1.poll();
                if(current > min) {
                    if(min != Integer.MIN_VALUE) {
                        queue1.add(min);
                    }

                    min = current;
                } else {
                    queue1.add(current);
                }
                if(innerCount == originalCount-1) {
                    queue1.add(min);
                }
                innerCount++;
            }
            count++;
        }
        System.out.println("After=" + queue1);
    }
}
