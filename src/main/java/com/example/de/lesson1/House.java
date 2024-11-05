package com.example.de.lesson1;

public class House {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Myrka");
        System.out.println(cat1);

        Cat cat2 = new Cat("Klava", "black", 3, true);
        System.out.println(cat2);

        Cat cat3 = new Cat();
        System.out.println(cat3);

        cat1.sayHello();
        cat1.feed();

        System.out.println(cat1);

        Robot r1 = new Robot("Robot1", "I'm the first robot");
        Robot r2 = new Robot("Robot2", "I'm the second robot");
        Robot r3 = new Robot("Robot3", "I'm the second robot");

        r3.printTotalRobotCount();

        r1.printCurrentRobotInfo();


        Human h1 = new Human("Alex");
        Cat[] cats = {cat1, cat2, cat3};

        h1.feedCat(cats);


    }
}
