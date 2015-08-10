package main.gof.behaviour.state;

/**
 * Created by zmax.
 */
public class On implements State {
    public void pull(VendingMachineState wrapper) {
        wrapper.setState(new Food());
        System.out.println("Start vending machine");
    }
}
