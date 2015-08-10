package com.concurrency.framework.synchronize.locks;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {

        PricesExchange pricesExchange = new PricesExchange();

        Reader readers[] = new Reader[2];
        Thread threadsReader[] = new Thread[2];
        for (int i = 0; i < 2; i++) {
            readers[i] = new Reader(pricesExchange);
            threadsReader[i] = new Thread(readers[i]);
        }

        Writer writer = new Writer(pricesExchange);
        Thread threadWriter = new Thread(writer);
        for (int i = 0; i < 2; i++) {
            threadsReader[i].start();
        }
        threadWriter.start();
    }
}
