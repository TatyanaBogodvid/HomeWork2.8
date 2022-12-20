package transport;

public class Bus extends Transport implements Competing, com.sun.jdi.connect.Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void start(){
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается.");
        return true;
    }

    @Override
    public void pitStop(){
         System.out.println("Автобус прошел пит-стоп");
     }

    @Override
    public int bestLoopTime(){
        return (int)(Math.random()*15);
    }

    @Override
    public int maxSpeed(){
        return (int)(Math.random()*100);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void repair() {

        System.out.println("Автобус " + getBrand() + " " + getModel() + " отремонтирована!");
    }


}

