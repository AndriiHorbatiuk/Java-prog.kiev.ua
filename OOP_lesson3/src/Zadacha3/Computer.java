package Zadacha3;

/**
 * Created by Andrey on 22.07.2016.
 */
public class Computer {

    private int cpuFreq;
    private int cdromSpeed;
    private int ram;
    private int hdd;

    public void switchOn() {
        cpuFreq = Cpu.getCpuFreq();
        cdromSpeed = Cdrom.getCdromSpeed();
        ram = Ram.getRam();
        hdd = Hdd.getHddCapacity();
    }

    public void switchOff() {
        cpuFreq = 0;
        cdromSpeed = 0;
        ram = 0;
        hdd = 0;
    }

    public void displayHddSize() {
        System.out.println("Hdd size is: " + hdd + " Gb.");
    }

    public void checkForViruses() {
        if (cpuFreq <= 0) {
            System.out.println("Your computer is powered off! Switch it on and try again.");
        } else {
            System.out.println("Checking HDD for viruses. Your HDD capacity is: " + hdd + " Gb.");
        }
    }

    public int getCpuFreq() {
        return cpuFreq;
    }

    public void setCpuFreq(int cpuFreq) {
        this.cpuFreq = cpuFreq;
    }

    public int getCdromSpeed() {
        return cdromSpeed;
    }

    public void setCdromSpeed(int cdromSpeed) {
        this.cdromSpeed = cdromSpeed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
