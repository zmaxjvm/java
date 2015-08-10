package com.concurrency.framework.collections.nonblocking;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by zmax.
 */
public class Consumer implements Runnable {

    ConcurrentLinkedDeque<String> queue;

    Consumer(ConcurrentLinkedDeque<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        System.out.println("Consumer Started");
        String res;
        for (int i = 1; i < 40; i++) {
                res = queue.pollFirst();
                System.out.println("!Have got -> " + res);

            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

