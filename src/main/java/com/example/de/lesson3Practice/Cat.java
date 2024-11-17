package com.example.de.lesson2Practice;

public class Cat extends Animal {

    public Cat(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    public Cat(String name) {
        super(name, "white", 1, true);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm cat. My name is " + super.getName());
        meow();
    }

    public void meow() {
        System.out.println("meow!");
    }

}
