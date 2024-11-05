package com.example.de.lesson2_Inheritance.examples3;

public class Banana extends Fruit{

    private String country;

    public Banana(String title, int weight, String color) {
        super(title, weight, color);
    }

    public Banana(String title, int weight, String color, String country) {
        super(title, weight, color);
        this.country = country;
    }

    //В наследниках можно добавить свою логику к родительской
    @Override
    public String toString() {
        String result = super.toString();
        return result + " country " + country;
    }
}
