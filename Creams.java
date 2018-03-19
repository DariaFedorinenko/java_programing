package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.Age;
import ua.lviv.iot.model.enums.Expiration;

public class Creams extends HygieneProducts {
    private Age.CreamType type;

    public Creams(String name, Age age, String produced, Expiration expirationDate) {
        super(name, age, produced, expirationDate);
    }


    public void setType(Age.CreamType type) {
        this.type = type;
    }

    public Age.CreamType getType() {

        return type;
    }
}
