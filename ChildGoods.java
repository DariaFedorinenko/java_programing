package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.Age;
import ua.lviv.iot.model.enums.Expiration;

public abstract class ChildGoods {
    private String name ;
    private static Age age  ;
    private String produced;
    private String taste;
    private Expiration expirationDate ;
    private double price ;

    public ChildGoods(String name, Age age, String sex, Expiration expirationDate) {
        this.name = name;
        this.age = age;
        this.expirationDate = expirationDate;
        this.taste = sex;
    }

    public Expiration getExpiration() {
        return expirationDate;
    }

    public void setExpiration(Expiration expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return name + " " + age;
    }

    public String getName() {

        return name;
    }

    public void setAge(Age age) {
        ChildGoods.age = age;
    }

    public static Age getAge() {
        return age;
    }

    public void setProduced(String produced) {
        this.produced = produced;
    }

    public String getProduced() {

        return produced;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


}
