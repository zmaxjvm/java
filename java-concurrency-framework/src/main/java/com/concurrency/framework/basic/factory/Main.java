package com.concurrency.framework.basic.factory;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {

        MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
        Task task = new Task();
        System.out.printf("Starting the Threads\n");

        Thread thread;
        for (int i = 0; i < 10; i++) {
            thread = factory.newThread(task);
            thread.start();
        }

        System.out.printf("Factory stats:\n");
        System.out.printf("%s\n", factory.getStats());
    }

}
