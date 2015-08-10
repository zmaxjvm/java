package com.concurrency.framework.utilities.semaphore;

/**
 * Created by zmax.
 */
public class Main {

    private static final int COUNT = 100;

    public static void main(String args[]) {

        PrintQueue printQueue = new PrintQueue(4);

        Thread thread[] = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            thread[i] = new Thread(new Job(printQueue), "Thread" + i);
        }

        for (int i = 0; i < COUNT; i++) {
            thread[i].start();
        }

    }
}
