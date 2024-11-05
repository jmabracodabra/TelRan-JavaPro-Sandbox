package com.example.de.lesson2_Inheritance.examples3;

public class FruitApp {
    public static void main(String[] args) {

        Apple apple = new Apple("Apple", 2, "green");

        Banana banana = new Banana("Banana", 3, "yellow");

        Pineapple pineapple = new Pineapple("Pineapple", 5, "brown");

        Apple apple2 = new Apple("Apple", 2);

        Fruit[] fruits = {apple2, apple, banana, pineapple};

        for (Fruit fruit : fruits) {
            printFruit(fruit);
            if(fruit.isRipe()){
                System.out.println("This fruit " + fruit.getTitle() + " is ripe");
            } else {
                System.out.println("This fruit " + fruit.getTitle() + " is not ripe");

            }
        }

//        printFruit(apple2);
//        printFruit(banana);
//        printFruit(pineapple);

    }

    private static void printFruit(Fruit fruit) {
        System.out.println(fruit);
    }
}
