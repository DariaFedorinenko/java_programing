package com.company;

public class Diapers extends HygieneProducts{
    private String sex ;
    private String material ;

    public Diapers(String name, Age age, String sex , Expiration expirationDate ){
        super(name ,age ,sex , expirationDate );
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
