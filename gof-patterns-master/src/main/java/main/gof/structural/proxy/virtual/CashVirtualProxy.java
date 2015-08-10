package main.gof.structural.proxy.virtual;

/**
 * Created by zmax.
 * Virtual proxy.
 */
public class CashVirtualProxy implements Cash {
    private String bankName;
    private int cash;
    private RealCash realCash;

    public CashVirtualProxy(String bankName, int cash) {
        this.bankName = bankName;
        this.cash = cash;
    }

    public int getCacheInfo() {
        return this.cash;
    }

    public void setCache(int cash) {
        this.cash = cash;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }


    /**
     * provide to return real cache, example proxy work
     *
     * @return RealCash
     */
    public int getCache() {
        if (realCash == null) {
            realCash = new RealCash(cash, bankName);
        }
        realCash.getMoney();
        return realCash.getCash();
    }
}




