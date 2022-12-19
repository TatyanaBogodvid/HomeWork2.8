package transport;

import transport.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;

    private final double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public static boolean isNullOrEmpty(String s){
        return s == null || s.isEmpty();
    }

    public Transport(String brand, String model, double engineVolume) {
        if (isNullOrEmpty(brand)){
            this.brand = "нет информации";
        } else {
            this.brand = brand;
        }
        if (isNullOrEmpty(model)){
            this.model = "нет информации";
        } else {
            this.model = model;
        }
        if (engineVolume < 0){
            this.engineVolume = Math.abs(engineVolume);
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public void addDriver(Driver<?>... drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public abstract void start();

    public abstract void stop();

    public abstract boolean service();
    public abstract void repair();
}
