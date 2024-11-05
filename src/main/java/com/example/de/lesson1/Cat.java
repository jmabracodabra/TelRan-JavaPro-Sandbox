package com.example.de.lesson1;

public class Cat {

    private String name;
    private String color;
    private int age;
    private boolean isHungry;

    public Cat() {
    }

    public Cat(String name, String color, int age, boolean isHungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Cat(String name) {
        this.name = name;
        this.color = "white";
        this.age = 1;
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }

    public void feed() {
        isHungry = false;
        System.out.println("I'm not hungry");
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + ", isHungry=" + isHungry + '}';
    }
}
