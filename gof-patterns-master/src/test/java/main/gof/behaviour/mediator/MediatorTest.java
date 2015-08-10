package main.gof.behaviour.mediator;

import org.junit.Test;

public class MediatorTest {

    @Test
    public void doTransactionTransaction() {
        String tapeTransaction = "Sell";
        Trader trader = new Trader();
        trader.doTradeTransaction(tapeTransaction);
    }
}
