package main.gof.creational.singleton;

/**
 * Created by zmax.
 * <p>
 * Is a way to provide one and only one object of a particular type
 * <p>
 * The Singleton design pattern: you can
 * never instantiate more than one.
 * Since this isn't inherited from a Cloneable
 * base class and cloneability isn't added,
 * making it final prevents cloneability from
 * being added through inheritance:
 */

public class Singleton {
    private static Singleton singleton = new Singleton(47);
    private int i;

    /**
     * Constructor
     *
     * @param x value
     */
    private Singleton(int x) {
        i = x;
    }

    /**
     * Method for get singleton object
     *
     * @return singleton object
     */
    public static Singleton getSingleton() {
        return singleton;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}


