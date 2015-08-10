package main.gof.behaviour.mediator;

/**
 * Created by zmax.
 *
 * This is mediator class
 */
public class Mediator {

    public void doTransaction(String typeOfTransaction, int ExtendedPrice, String trader) {
        Transaction1 t1 = new Transaction1(typeOfTransaction, ExtendedPrice, trader);
        Transaction2 t2 = new Transaction2(typeOfTransaction, ExtendedPrice, trader);
        TransactionN tN = new TransactionN(typeOfTransaction, ExtendedPrice, trader);
        // add more transactions...
    }
}
