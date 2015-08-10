package main.gof.structural.proxy.virtual;

import org.junit.Test;

public class CashVirtualProxyTest {

    @Test
    public void getRealCacheTest() {
        String fineName = "Bank Name Test";
        int cache = 1000000;

        Cash paycheck = new CashVirtualProxy(fineName, cache);

        System.out.println("Your paycheck cash ->" + paycheck.getCacheInfo());
        System.out.println(paycheck.getCache());
    }
}


