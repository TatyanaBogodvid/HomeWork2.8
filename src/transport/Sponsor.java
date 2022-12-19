package transport;

import static transport.Transport.isNullOrEmpty;

public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        if (isNullOrEmpty(name)){
            this.name = "Нет информации";
        } else {
        this.name = name;
        }
        if (amount < 0){
            this.amount = Math.abs(amount);
        } else {
            this.amount = amount;
        }
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void toSposorRace(){
        System.out.println("Спонсор " + getName() + " проспонсировал заезд на " + getAmount());
    }
}
