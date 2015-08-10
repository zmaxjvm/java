package com.concurrency.framework.utilities.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by zmax.
 */
public class ServiceMan {

    private CyclicBarrier cyclicBarrier;
    private List<String> inQueue = new ArrayList<String>();

    public ServiceMan(int hardWorking) {
        cyclicBarrier = new CyclicBarrier(hardWorking, new Runnable() {
            @Override
            public void run() {
                System.out.println("CyclicBarrier:");
                System.out.println(" Start queue " + inQueue);
                inQueue.clear();
            }
        });
    }

    public void recharge(String name) {
        try {
            inQueue.add(name);
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
