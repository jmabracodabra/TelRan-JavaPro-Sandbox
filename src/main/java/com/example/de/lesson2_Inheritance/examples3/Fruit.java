package com.example.de.lesson2_Inheritance.examples3;

public class Fruit {

    public String getTitle() {
        return title;
    }

    private String title;

    private int weight;

    private String color;

    public Fruit(String title, int weight, String color) {
        this.title = title;
        this.weight = weight;
        this.color = color;
    }

    public Fruit(String title, int weight) {
        this.title = title;
        this.weight = weight;
    }

    public boolean isRipe() {
        return true;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
