package com.concurrency.framework.forkjoin.framework.forkjoinsum;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by zmax.
 */
public class RecursiveSumTask extends RecursiveTask<Long> {
    private static final long serialVersionUID = 1L;
    private final long from;
    private final long to;
    private long[] array;
    final int splitSize = 10_000; //Some threshold size to spit the task

    RecursiveSumTask(long[] array, long from, long to) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    @Override
    protected Long compute() {
        long count = 0L;
        List<RecursiveTask<Long>> forks = new LinkedList<>();

        if (to - from > splitSize) {
            // task is huge so divide in half
            long mid = (from + to) >>> 1;

            //Divided the given task into task1 and task2
            RecursiveSumTask task1 = new RecursiveSumTask(array, from, mid);
            forks.add(task1);
            task1.fork();

            RecursiveSumTask task2 = new RecursiveSumTask(array, mid, to);
            forks.add(task2);
            task2.fork();
        } else {
            //Calculating sum of the given array range
            for (int i = (int) from; i < to; i++) {
                count = count + array[i];
            }
        }

        //Waiting for the result
        for (RecursiveTask<Long> task : forks) {
            count = count + task.join();
        }
        return count;
    }

}
