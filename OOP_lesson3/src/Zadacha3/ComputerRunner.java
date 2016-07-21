package Zadacha3;

/**
 * Created by Andrey on 22.07.2016.
 */
public class ComputerRunner {
    public static void main(String[] args) {
        Hdd.setHddCapacity(2048);
        Ram.setRam(4096);
        Cpu.setCpuFreq(1700);
        Cdrom.setCdromSpeed(32);
        Computer computer = new Computer();
        computer.switchOn();
        computer.checkForViruses();
        computer.displayHddSize();
        computer.switchOff();
        computer.checkForViruses();
    }
}
