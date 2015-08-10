package main.gof.structural.adapter;

/**
 * Created by zmax.
 * Class provide to adapt API 'Programmer'
 */
public class DifficultDeviceAdapter extends DifficultDevice implements Device {

    public void on() {
        int startPoint = 7;
        startDevice(startPoint);
    }

    public void off() {
        int endPoint = 11;
        stopDevice(endPoint);
    }
}
