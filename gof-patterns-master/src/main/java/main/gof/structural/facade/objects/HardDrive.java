package main.gof.structural.facade.objects;

/**
 * Created by zmax.
 * Complex parts 2
 */
public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Hard Drive start...");
        //next operations
        //start service device
        return new byte[]{101};
    }
}
