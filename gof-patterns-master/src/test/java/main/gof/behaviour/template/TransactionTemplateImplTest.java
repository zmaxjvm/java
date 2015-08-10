package main.gof.behaviour.template;

import org.junit.Test;

/**
 * Test 'Strategy' algorithm known as 'Policy'
 */

public class TransactionTemplateImplTest {

    @Test
    public void testTransactionTemplate() {
        TransactionTemplateImpl transactionTemplateImpl = new TransactionTemplateImpl();
        transactionTemplateImpl.executeTransaction();
    }
}
