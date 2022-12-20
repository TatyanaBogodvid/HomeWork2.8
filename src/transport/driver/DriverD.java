package transport.driver;

import transport.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getName() + "заправляет автоус " + transport.getBrand());
    }
}
