package com.example.de.lesson1;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedCat(Cat cat) {
        cat.feed();
        System.out.println(name + " is feeding " + cat.getName());
    }

    public void feedCat(Cat[] cats) {
        for (Cat cat : cats) {
            feedCat(cat);
        }
    }
}
