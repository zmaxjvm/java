package main.gof.behaviour.template;

/**
 * Created by zmax.
 */
public abstract class TransactionTemplate {

    public abstract void begin();

    public abstract void persist();

    public abstract void commit();

    public abstract void close();

    /**
     * Work as template method
     */
    public void executeTransaction() {
        begin();
        persist();
        commit();
        close();
    }
}
