package transport;

import transport.driver.Driver;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;

    private final double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

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

    public Set<Driver<?>> getDrivers() {

        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {

        return mechanics;
    }

    public Set<Sponsor> getSponsors() {

        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, sponsors);
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
