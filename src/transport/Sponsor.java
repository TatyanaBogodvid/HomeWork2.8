package transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amount == sponsor.amount && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }
}
