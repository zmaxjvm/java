package com.concurrency.framework.synchronize.synchronizedthis;

/**
 * Created by zmax.
 */
public class TicketOffice2 implements Runnable {

    private Cinema cinema;

    public TicketOffice2(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            cinema.ticketWindow1(i);
        }

        for (int i = 50; i < 100; i++) {
            cinema.ticketWindow2(i);
        }
    }

}
