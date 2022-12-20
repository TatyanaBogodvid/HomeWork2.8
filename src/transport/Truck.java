package transport;

public class Truck extends Transport implements Competing, com.sun.jdi.connect.Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void start(){
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.3;
    }

    @Override
    public void pitStop(){
        System.out.println("Грузовик прошел пит-стоп");
    }

    @Override
    public int bestLoopTime(){
        return (int)(Math.random()*13);
    }

    @Override
    public int maxSpeed(){
        return (int)(Math.random()*110);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " отремонтирован!");
    }
}
