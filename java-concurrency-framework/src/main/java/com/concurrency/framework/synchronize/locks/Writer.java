package com.concurrency.framework.synchronize.locks;

/**
 * Created by zmax.
 */
public class Writer implements Runnable {

    private PricesExchange pricesExchange;

    public Writer(PricesExchange pricesExchange) {
        this.pricesExchange = pricesExchange;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.printf(i + " Writer: Attempt to modify the prices.\n");
            pricesExchange.setPrices(Math.random() * 10, Math.random() * 8);
            System.out.printf(i + " Writer: Prices have been modified.\n");
        }
    }

}
