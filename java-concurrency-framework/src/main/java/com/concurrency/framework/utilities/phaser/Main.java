package com.concurrency.framework.utilities.phaser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmax.
 */
public class Main {

    private static PhaserExample phaserExample = new PhaserExample();

    public static void main(String args[]) {

        List<Runnable> printersList = new ArrayList<Runnable>();
        for (int i = 0; i < 6; i++) {
            printersList.add(new Thread(new PrinterDevice( "PrinterDevice" + (i + 1))));
        }
        phaserExample.runTasks(printersList);
    }
}
