package com.company;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addChildGoods(new Diapers("Dada",Age.FORBIRTH, "for girls and boys", Expiration.INDEFINITEY));
        shop.addChildGoods(new Creams("Hipp", Age.FOR3MONTH, "Germany", Expiration.UPTO4YEARS));
        shop.addChildGoods(new Porridge("Hipp", Age.FOR6MONTH,"apple", Expiration.UPTO24MONTHS));
        shop.addChildGoods(new Juices("Bebivita", Age.FOR3MONTH, "orange", Expiration.INDEFINITEY));
        shop.addChildGoods(new Yogurt("Humana", Age.FOR6MONTH, "strawberry", Expiration.INDEFINITEY));
        shop.addChildGoods(new Puree("Rudolf", Age.FOR6MONTH, "apple and carrot", Expiration.UPTO24MONTHS));

        System.out.println("\nInitial list of the chidren`s goods:");
        printList(shop.getChildGoodsList());

        System.out.println("\nList of the chidren`s goods that have expiration date - 6 month:");
        System.out.println(shop.findByAge(Age.FOR6MONTH));
        }


    private static void printList(List<ChildGoods> childGoodsList) {
        for(ChildGoods childGoods : childGoodsList){
            System.out.println(childGoods.getName() + ",");
            System.out.println(ChildGoods.getAge()+ ",");
            System.out.println(childGoods.getExpiration()+"."+"\n");

        }
    }

}