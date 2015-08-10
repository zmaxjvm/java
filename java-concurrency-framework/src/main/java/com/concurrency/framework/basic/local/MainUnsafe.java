package com.concurrency.framework.basic.local;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class MainUnsafe {
    public static void main(String[] args) {
        UnsafeTask task = new UnsafeTask();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
