package com.concurrency.framework.synchronize.synchronizedthis;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        TicketOffice1 ticketOffice1 = new TicketOffice1(cinema);
        Thread thread1 = new Thread(ticketOffice1, "TicketOffice 1");

        TicketOffice2 ticketOffice2 = new TicketOffice2(cinema);
        Thread thread2 = new Thread(ticketOffice2, "TicketOffice 2");

        thread1.start();
        thread2.start();

//Wait for the completion of the threads.
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("Cinema with 100 seats sold = " + cinema.getTicketAvailable().size() + " tickets");

    }
}
