package com.concurrency.framework.synchronize.bloclock;

/**
 * Created by zmax.
 */
public class Main {

    private static final int SIZE = 5;

    public static void main(String args[]) {

        PrintQueue printQueue = new PrintQueue();

        Thread thread[] = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            thread[i] = new Thread(new Job(printQueue), "Thread " + i);
        }

        for (int i = 0; i < SIZE; i++) {
            thread[i].start();
        }
    }
}
