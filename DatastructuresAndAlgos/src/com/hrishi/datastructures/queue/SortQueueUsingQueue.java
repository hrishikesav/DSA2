package com.hrishi.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class SortQueueUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
        queue1.add(2);
        queue1.add(5);
        queue1.add(8);
        queue1.add(1);
        queue1.add(9);
        queue1.add(3);

        System.out.println("Before=" + queue1);
        Queue<Integer> dummyQueue = new ArrayDeque<>();

        int masterCount = 0;
        int originalSize = queue1.size();
        while(masterCount < queue1.size()) {
            int count = 0;
            int minElement = Integer.MIN_VALUE;
            while(count < originalSize) {
                int num = queue1.poll();
                if ( num > minElement) {
                    dummyQueue.add(num);
                    minElement = num;
                } else {
                    queue1.add(num);
                }
                count++;
            }

            while(!dummyQueue.isEmpty()) {
                queue1.add(dummyQueue.poll());
            }
            masterCount++;
        }


        System.out.println("dummyQueue=" + dummyQueue);
        System.out.println("queue1=" + queue1);

    }
}
