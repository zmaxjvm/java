package main.gof.behaviour.mediator;

/**
 * Created by zmax.
 *
 * Mock transactions
 */
public class Transaction1 {
    public Transaction1(String typeOfTransaction, int quantity, String trader) {
        System.out.println("Transaction 1 executed " + typeOfTransaction + " " + quantity + " " + trader);
        //execute transaction ...
    }
}
