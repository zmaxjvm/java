package com.concurrency.framework.forkjoin.framework.forkjoinsum;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by zmax.
 */
public class MaximumFinder extends RecursiveTask<Integer> {

    private static final int SEQUENTIAL_THRESHOLD = 500;
    private static final int PARALLELISM = 160;

    private final int[] data;
    private final int start;
    private final int end;

    private static long startTime;
    private static long endTime;

    public MaximumFinder(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    public MaximumFinder(int[] data) {
        this(data, 0, data.length);
    }

    public static void main(String[] args) throws InterruptedException {
        // create a random data set
        int[] data = new int[1_000_000];
        initData(data);

        final ForkJoinPool pool = new ForkJoinPool(PARALLELISM);
        final MaximumFinder finder = new MaximumFinder(data);

        startTime = System.currentTimeMillis();
        System.out.println(pool.invoke(finder));
        endTime = System.currentTimeMillis();
        System.out.println("SEQUENTIAL_THRESHOLD = " + SEQUENTIAL_THRESHOLD + ", ForkJoinPool has finished -> " + (endTime - startTime) + " milliseconds");
    }


    @Override
    protected Integer compute() {
        final int length = end - start;
        if (length < SEQUENTIAL_THRESHOLD) {
            return computeDirectly();
        }

        final int split = length / 2;
        final MaximumFinder left = new MaximumFinder(data, start, start + split);
        left.fork();
        final MaximumFinder right = new MaximumFinder(data, start + split, end);
        return Math.max(right.compute(), left.join());
    }

    private Integer computeDirectly() {
//        System.out.println(Thread.currentThread() + " computing: " + start + " to " + end);
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    private static void initData(int[] data) {
        final Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(777);
        }
    }
}