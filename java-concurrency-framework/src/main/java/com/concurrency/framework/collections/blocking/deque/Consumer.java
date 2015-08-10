package com.concurrency.framework.collections.blocking.deque;

import java.util.concurrent.BlockingDeque;

/**
 * Created by zmax.
 */
public class Consumer implements Runnable {

    BlockingDeque<String> queue;

    Consumer(BlockingDeque<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        System.out.println("Consumer Started");
        String res = null;
        for (int i = 1; i < 40; i++) {
            try {
//Wait when object will add
                res = queue.takeLast();
                System.out.println("!Have got -> " + res);
            } catch (InterruptedException e) {
                System.out.println("Cannot get element! -  " + e);
            }
        }
    }
}

