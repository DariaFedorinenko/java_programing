package com.company;

public class Creams extends HygieneProducts{
    private CreamType  type ;

    public Creams(String name, Age age, String produced, Expiration expirationDate ) {
        super(name , age , produced , expirationDate);
    }


    public void setType(CreamType type) {
        this.type = type;
    }

    public CreamType getType() {

        return type;
    }
}
