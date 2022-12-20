package transport;

import java.util.Objects;

import static transport.Transport.isNullOrEmpty;

public class Mechanic<T extends Transport> {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        if (isNullOrEmpty(name)) {
            this.name = "Нет информации";
        } else {
            this.name = name;
        }
        if (isNullOrEmpty(surname)) {
            this.surname = "Нет информации";
        } else {
            this.surname = surname;
        }
        if (isNullOrEmpty(company)){
            this.company = "Нет информации";
        } else {
            this.company = company;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(T t){
        return t.service();
    }

    public void repair(T t){
        t.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}
