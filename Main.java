package com.company;

public class Main {

    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zooAnimals = new Zoo("Animals" , "middle" , "only predators" , 45);
        Zoo zooSweetAnimals = new Zoo("Sweet animals" , "small" , "pets" , 27 , 12);

        System.out.println(zoo1.toString());
        System.out.println(zooAnimals.toString());
        System.out.println(zooSweetAnimals.toString());

        Zoo.printStaticSum();
        zooSweetAnimals.printSum();

        zoo1.resetValues("Dela planet" , "big" , "only dog" , 100 , 50);
        zooSweetAnimals.resetValues("Safary" , "middle" , "predators" , 62 , 42);
        zooAnimals.setVisitors(10);

        System.out.println(zoo1.toString());
        System.out.println(zooAnimals.toString());
        System.out.println(zooSweetAnimals.toString());

        Zoo.printStaticSum();
        zoo1.printSum();
    }

    private static class ZooSweetAnimals {
    }
}

