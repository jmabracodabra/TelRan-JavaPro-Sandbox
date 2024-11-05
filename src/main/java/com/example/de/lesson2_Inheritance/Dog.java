package com.example.de.lesson2_Inheritance;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Hi");
    }

    //final method - можно использовать, но нельзя переопределять у наследников
    //final class - запрещает наследование от этого класса
    public final void run() {
        System.out.println("Dog run!");
    }
}
