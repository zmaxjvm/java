package com.concurrency.framework.forkjoin.framework.forkjoinsum;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by zmax.
 */
public class ForkJoinSumTask {

    public void fillArray(long[] array) {
        for (int i=0; i<array.length; i++) {
            array[i] = i;
        }
    }

    public static void main(String[] args) {
        ForkJoinSumTask sum = new ForkJoinSumTask();
        long[] array = new long[1_000_000];
        sum.fillArray(array);

        System.out.println("Number of processors available: " + Runtime.getRuntime().availableProcessors());

        ForkJoinPool fjpool = new ForkJoinPool(32); //Default parallelism level = 4 == Runtime.getRuntime().availableProcessors()

        for (int i=0; i<10; i ++) {
            RecursiveSumTask task = new RecursiveSumTask(array, 0, array.length);
            long start = System.currentTimeMillis();
            System.out.println("Result: " + fjpool.invoke(task));
            System.out.println("Parallel processing time: "    + (System.currentTimeMillis() - start)+ " ms");
        }

        System.out.println("Number of steals: " + fjpool.getStealCount() + "\n");
    }
}
