package com.example.de.lesson1;

public class DogApp {

    public static void main(String[] args) {
        Dog barsik = new Dog("Bars", 2);
        System.out.println("Dog's name is " + barsik.getName() + ", age is " + barsik.getAge());

        barsik.setAge(3);
        System.out.println("Dog's name is " + barsik.getName() + ", age is " + barsik.getAge());
    }
}
