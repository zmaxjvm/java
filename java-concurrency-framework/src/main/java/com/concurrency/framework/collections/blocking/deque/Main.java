package com.concurrency.framework.collections.blocking.deque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        BlockingDeque<String> deque = new LinkedBlockingDeque<String>();

        Thread producer1 = new Thread(new Producer1(deque));
        Thread producer2 = new Thread(new Producer2(deque));

        Thread consumer = new Thread(new Consumer(deque));
        producer1.start();
        producer2.start();
        consumer.start();
    }
}
