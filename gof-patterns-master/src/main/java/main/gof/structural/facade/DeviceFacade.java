package main.gof.structural.facade;

import main.gof.structural.facade.objects.Cpu;
import main.gof.structural.facade.objects.HardDrive;
import main.gof.structural.facade.objects.Memory;

/**
 * Created by zmax.
 * Class Facade
 */
public class DeviceFacade {
    private static final long BOOT_ADDRESS = 1111111;
    private static final long BOOT_SECTOR = 1111111;
    private static final int SECTOR_SIZE = 1024;

    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public DeviceFacade() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    /**
     * Method generalize a few functionality
     * for the make simple access interface
     */
    public void startDeviceFacadeExample() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
