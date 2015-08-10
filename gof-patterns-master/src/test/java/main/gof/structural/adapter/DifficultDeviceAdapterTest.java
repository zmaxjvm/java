package main.gof.structural.adapter;

import org.junit.Test;

public class DifficultDeviceAdapterTest {

    @Test
    public void onOfTest() {
        DifficultDeviceAdapter difficultDeviceAdapter = new DifficultDeviceAdapter();
        difficultDeviceAdapter.on();
        difficultDeviceAdapter.off();
    }
}


