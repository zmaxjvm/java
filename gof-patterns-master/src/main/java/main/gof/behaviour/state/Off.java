package main.gof.behaviour.state;

/**
 * Created by zmax.
 */
public class Off implements State {
    public void pull(VendingMachineState wrapper) {
        System.out.println("Machine will be shutting down");
    }
}
