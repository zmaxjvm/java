package main.gof.behaviour.template;

/**
 * Created by zmax.
 */
public class TransactionTemplateImpl extends TransactionTemplate {

    public void begin() {
        System.out.println("Begin transaction");
    }

    public void persist() {
        System.out.println("Persist data");
    }

    public void commit() {
        System.out.println("Commit data");
    }

    public void close() {
        System.out.println("Close transaction");
    }
}



