package main.gof.behaviour.state;

/**
 * Created by zmax.
 */
interface State {
    void pull(VendingMachineState wrapper);
}
