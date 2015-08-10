package com.concurrency.framework.deadlocks.deadlock;

/**
 * Created by zmax.
 */
public class Main {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.setThread2(t2);
        t2.setThread1(t1);
        t1.start();
        t2.start();
    }
}