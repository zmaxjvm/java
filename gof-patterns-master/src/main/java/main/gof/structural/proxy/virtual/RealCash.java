package main.gof.structural.proxy.virtual;

/**
 * Created by zmax.
 * Real cash class
 */
public class RealCash {

    private String bunkName;
    private int cash;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public RealCash(int cash, String bunkName) {
        this.bunkName = bunkName;
        this.cash = cash;
    }

    public void getMoney() {
        //bank iterations one
        //bank iterations two
        //bank iterations N...
        System.out.println(bunkName + ", your money -> " + cash);
    }
}
