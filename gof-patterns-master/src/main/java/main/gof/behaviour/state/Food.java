package main.gof.behaviour.state;

/**
 * Created by zmax.
 */
public class Food implements State {
    public void pull(VendingMachineState wrapper) {
        wrapper.setState(new Change());
        System.out.println("Get food");
    }
}