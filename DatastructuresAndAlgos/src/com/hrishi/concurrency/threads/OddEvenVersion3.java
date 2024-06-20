package com.hrishi.concurrency.threads;

public class OddEvenVersion3 {
    static Object lock = new Object();
    static volatile int number = 1;
    static volatile boolean isOdd = false;

    public static void main(String[] args) {
        Thread th1 = new Thread(new OddThread());
        th1.setName("OddThread");
        th1.start();

        Thread th2 = new Thread(new EvenThread());
        th2.setName("EvenThread");
        th2.start();

    }

    static class OddThread implements Runnable {
        public void run() {
            while (number < 10) {
                if (Thread.currentThread().getName().equals("OddThread") && number % 2 != 0) {
                    synchronized (lock) {
                        while (isOdd) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                System.out.println("Exception:" + e);
                            }
                        }

                        System.out.println(Thread.currentThread().getName() + "=" + number);
                        number++;
                        isOdd = true;
                        lock.notifyAll();
                    }
                }
            }
        }
    }

    static class EvenThread implements Runnable {
        public void run() {
            while (number < 10) {
                if (Thread.currentThread().getName().equals("EvenThread") && number % 2 == 0) {
                    synchronized (lock) {
                        while (!isOdd) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                System.out.println("Exception:" + e);
                            }
                        }

                        System.out.println(Thread.currentThread().getName() + "=" + number);
                        number++;
                        isOdd = false;
                        lock.notifyAll();
                    }
                }
            }
        }
    }
}
