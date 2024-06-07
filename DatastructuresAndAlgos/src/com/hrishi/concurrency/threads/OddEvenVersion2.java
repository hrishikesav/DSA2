package com.hrishi.concurrency.threads;

import static com.hrishi.concurrency.threads.OddEvenVersion2.*;


public class OddEvenVersion2 {

    static final Object lock = new Object();
    static volatile int num = 1;
    static volatile boolean isOdd = true;


    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddEvenThread());
        oddThread.setName("OddThread");
        oddThread.start();

        Thread evenThread = new Thread(new OddEvenThread());
        evenThread.setName("EvenThread");
        evenThread.start();
    }
}

class OddEvenThread implements Runnable {
    public void run() {
        while(num < 10) {
            if(Thread.currentThread().getName().equals("OddThread") && num%2 != 0) {
                synchronized (lock) {
                    while(!isOdd) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " = " + num);
                    num++;
                    isOdd = false;
                    lock.notify();
                }
            } else if(Thread.currentThread().getName().equals("EvenThread") && num%2 == 0) {
                synchronized (lock) {
                    while(isOdd) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " = " + num);
                    num++;
                    isOdd = true;
                    lock.notify();
                }
            }
        }
    }
}