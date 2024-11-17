package com.example.de.lesson2Practice;

public abstract class Creature {

    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
