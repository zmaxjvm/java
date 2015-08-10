package com.concurrency.framework.basic.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zmax.
 */
public class AtomicCounter {

    private AtomicInteger c = new AtomicInteger(0);
    private int i = 0 ;

    public void increment() {
        i++;
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

    public int getInt() {
        return i;
    }


}
