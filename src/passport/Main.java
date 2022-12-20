package passport;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("12345",
                                    "Иван",
                                    "Иванов",
                                    "Иванович",
                                      1996));
        passports.add(new Passport("2365",
                                    "Петр",
                                  "Иванов",
                                "Иванович",
                                 1985));

        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);

    }
}
