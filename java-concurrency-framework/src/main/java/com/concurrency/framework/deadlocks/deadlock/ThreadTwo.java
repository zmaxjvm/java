package com.concurrency.framework.deadlocks.deadlock;

/**
 * Created by zmax.
 */
public class ThreadTwo extends Thread {
    Thread t;

    public ThreadTwo() {
        System.out.println("ThreadTwo create");
    }

    public void run() {
        System.out.println("ThreadTwo start");
        try {
            System.out.println("ThreadTwo waiting MyThreadOne finish…");
            t.join();

        } catch (Exception e) {
        }
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ThreadTwo finished");
    }

    public void setThread1(Thread t) {
        this.t = t;
    }
}