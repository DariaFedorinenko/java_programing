package ua.lviv.iot;

import ua.lviv.iot.controller.Shop;
import ua.lviv.iot.model.*;
import ua.lviv.iot.model.enums.Age;
import ua.lviv.iot.model.enums.Expiration;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addChildGoods(new Diapers("Dada", Age.FORBIRTH, "for girls and boys", Expiration.INDEFINITEY));
        shop.addChildGoods(new Creams("Hipp", Age.FOR3MONTH, "Germany", Expiration.UPTO4YEARS));
        shop.addChildGoods(new Porridge("Hipp", Age.FOR6MONTH, "apple", Expiration.UPTO24MONTHS));
        shop.addChildGoods(new Juices("Bebivita", Age.FOR3MONTH, "orange", Expiration.INDEFINITEY));
        shop.addChildGoods(new Yogurt("Humana", Age.FOR6MONTH, "strawberry", Expiration.INDEFINITEY));
        shop.addChildGoods(new Puree("Rudolf", Age.FOR6MONTH, "apple and carrot", Expiration.UPTO24MONTHS));


        boolean condition = true;
        do {
            System.out.println("\nMenu:");
            System.out.println("\n1 -Show  list of the chidren`s goods ");
            System.out.println("\n2 -Show List of the chidren`s goods that have expiration date - 6 month  ");
            System.out.println("\n3 -Show sorted list by expiration date ");
            System.out.println("\n4 -Exit:");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n List of the chidren`s goods:");
                    printList(shop.getChildGoodsList());
                    break;
                case 2:
                    System.out.println("\nList of the chidren`s goods that have expiration date - 6 month:");
                    System.out.println(shop.findByAge(Age.FOR6MONTH));
                    break;
                case 3:
                    System.out.println("\nSorted list:\n");
                    shop.sortByExpiration();
                    printList(shop.getChildGoodsList());
                    break;
                case 4:
                    System.out.println("\nExit:");
                    condition = false;


            }
        }
        while (condition);
    }

    private static void printList(List<ChildGoods> childGoodsList) {
        childGoodsList.forEach(System.out::println);
    }

}