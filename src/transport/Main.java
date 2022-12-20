package transport;

import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sponsor lukoil = new Sponsor("Лукоил", 100000);
        Sponsor michelin = new Sponsor("Michelin", 300000);
        Mechanic petro = new Mechanic<Car>("Петр", "Васильев", "Компания");
        Mechanic evgen = new Mechanic<Truck>("Евгений", "Петров", "Рога");
        Mechanic denis = new Mechanic<Bus>("Денис", "Лампочкий", "Копыта");

        Car lada = new Car("Lada","Granta", 1.7);
        lada.addDriver(new DriverB("Иван", true, 3));
        lada.addMechanic(petro);
        lada.addSponsor(lukoil, michelin);

        Car audi = new Car ("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car ("BMW", "Z8", 2.8);
        Car kia = new Car ("Kia", "Sportage 4-го поколения", 2.4);

        Bus liAZ = new Bus("ЛиАЗ", "Курсор", 5.0);
        liAZ.addDriver(new DriverD("Василий", true, 01));
        liAZ.addMechanic(denis);
        liAZ.addSponsor(michelin);

        Bus mAZ = new Bus("МАЗ", "Междугородец", 3.5);
        Bus liaz = new Bus("ЛиАЗ", "Курсор1", 3.0);
        Bus maz = new Bus("МАЗ", "Междугородец1", 3.7);

        Truck krAZ = new Truck("КрАЗ", "С 18", 6.2);
        krAZ.addDriver(new DriverD("Василий", true, 01));
        krAZ.addMechanic(evgen);
        krAZ.addSponsor(lukoil);
        Truck kamAZ = new Truck("КамАЗ", "4308", 6.2);
        Truck gAZ = new Truck("ГАЗ", "22177", 6.2);
        Truck volvo = new Truck("Volvo", "FL7", 6.2);

        lada.pitStop();
        mAZ.pitStop();
        gAZ.pitStop();

        DriverB ivan = new DriverB("Иван", true, 3);
        DriverC petr = new DriverC("Петр", true, 6);
        DriverD vasiliy = new DriverD("Василий", true, 01);

        ivan.startMove(lada);
        ivan.stopMove(lada);
        ivan.refill(lada);

        ivan.printInfo(lada);

        service(lada, mAZ,gAZ);

        List<Transport> transports = List.of(lada, liAZ, krAZ);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(krAZ);
        serviceStation.service();
        serviceStation.service();
        for (Transport transport : transports){
            printInfo(transport);
        }



    }

    private static void service(Transport... transports){
        for (int i = 0; i < transports.length; i ++){
            serviceTransport(transports[i]);
        }
    }

    private static void serviceTransport(Transport transport){
            try{
                if(!transport.service()) {
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику.");
                }
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
        }
    }

    public static void printInfo(Transport transport){
        System.out.println("Информация по транспотру " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver: transport.getDrivers()){
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor: transport.getSponsors()){
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic: transport.getMechanics()){
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " из " + mechanic.getCompany());
        }
    }


}