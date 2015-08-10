package main.gof.behaviour.state;

/**
 * Created by zmax.
 *
 */
public class VendingMachineState {

    private State stateCurrent;

    public VendingMachineState() {
        stateCurrent = new On();
    }

    public void setState(State s) {
        stateCurrent = s;
    }

    public void pull() {
        stateCurrent.pull(this);
    }
}
