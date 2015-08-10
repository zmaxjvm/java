package com.concurrency.framework.deadlocks.deadlock;

/**
 * Created by zmax.
 */
public class ThreadOne extends Thread {

    Thread t;

    public ThreadOne() {
        System.out.println("ThreadOne create");
    }

    public void run() {
        System.out.println("ThreadOne start");
        try {
            sleep(1000);
        } catch (Exception e) {
        }
        try {
            System.out.println("ThreadOne waiting MyThreadTwo finish…");
            t.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ThreadOne finished");
    }

    public void setThread2(Thread t) {
        this.t = t;
    }
}