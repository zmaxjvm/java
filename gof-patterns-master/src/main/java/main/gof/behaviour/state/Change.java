package main.gof.behaviour.state;

/**
 * Created by zmax.
 *
 */
public class Change implements State {
    public void pull(VendingMachineState wrapper) {
        wrapper.setState(new Off());
        System.out.println("Get change");
    }
}
