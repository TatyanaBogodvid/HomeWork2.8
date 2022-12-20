package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String name;
    private boolean hasDrivingLicense;
    private int experience;

    public static boolean isNullOrEmpty(String s){
        return s == null || s.isEmpty();
    }

    public Driver(String name, boolean hasDrivingLicense, int experience) {
        if (isNullOrEmpty(name)){
            this.name = "нет информации";
        } else {
            this.name = name;
        }
        this.hasDrivingLicense = hasDrivingLicense;
        if (experience < 0){
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public String getName() {

        return name;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {

        this.hasDrivingLicense = hasDrivingLicense;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public abstract void startMove(T transport);
    public abstract void stopMove(T transport);
    public abstract void refill(T transport);

    public void printInfo(T transport){
        System.out.println("Водитель " + name + " управляет автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде");
    }
}
