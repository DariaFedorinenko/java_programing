package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.Age;
import ua.lviv.iot.model.enums.Expiration;

public class Puree extends BabyFood {
    public Puree(String name, Age age, String taste, Expiration expirationDate) {
        super(name, age, taste, expirationDate);
    }
}
