package com.concurrency.framework.synchronize.bloclock;

/**
 * Created by zmax.
 */
public class Job implements Runnable {

    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        Object document = new Object();
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
        printQueue.printJob(document);

        System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
    }

}
