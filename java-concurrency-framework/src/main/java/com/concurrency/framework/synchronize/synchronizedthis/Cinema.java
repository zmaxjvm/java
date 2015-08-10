package com.concurrency.framework.synchronize.synchronizedthis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmax.
 */
public class Cinema {

    private List<Integer> ticketAvailable = new ArrayList<Integer>();

    public List<Integer> getTicketAvailable() {
        return ticketAvailable;
    }

    public void ticketWindow1(int place) {

        synchronized (this) {
            if (!ticketAvailable.contains(place) && place < 100) {
                ticketAvailable.add(place);
            }
        }

    }

    public synchronized void ticketWindow2(int place) {
        if (!ticketAvailable.contains(place) && place < 100) {
            ticketAvailable.add(place);
        }
    }

}
