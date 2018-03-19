package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.Age;
import ua.lviv.iot.model.enums.Expiration;

public abstract class BabyFood extends ChildGoods {
    private String taste ;
    private String include ;
    private double weight ;

    public BabyFood(String name, Age age, String taste, Expiration expirationDate) {
        super(name, age, taste, expirationDate);
    }


    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
