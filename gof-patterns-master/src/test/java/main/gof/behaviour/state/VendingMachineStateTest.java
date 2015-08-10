package main.gof.behaviour.state;

import org.junit.Test;


public class VendingMachineStateTest {

    @Test
    public void stateTest() {
        VendingMachineState chain = new VendingMachineState();
        int i=0;
        while (i < 4) {
            System.out.print(i + "Press ");
            chain.pull();
            i++;
        }
    }
}
