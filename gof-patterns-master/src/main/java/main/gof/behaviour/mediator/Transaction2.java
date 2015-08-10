package main.gof.behaviour.mediator;

/**
 * Created by zmax.
 *
 * Mock transactions
 */
public class Transaction2 {
    public Transaction2(String typeOfTransaction, int quantity, String trader) {
        System.out.println("Transaction 2 executed" + typeOfTransaction + " " + quantity + " " + trader);
        //execute transaction ...
    }
}
