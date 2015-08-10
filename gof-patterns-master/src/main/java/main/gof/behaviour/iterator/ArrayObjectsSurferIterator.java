package main.gof.behaviour.iterator;

import main.gof.behaviour.iterator.object.DVD;

/**
 * Created by zmax.
 *
 * Basic iterator implementation
 */
public class ArrayObjectsSurferIterator implements Iterator {

    private DVD[] items;
    private int position = 0;

    public ArrayObjectsSurferIterator(DVD[] item) {
        this.items = item;
    }

    public Object next() {
        DVD dvd = items[position];
        position = position + 1;
        return dvd;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else return true;
    }
}




