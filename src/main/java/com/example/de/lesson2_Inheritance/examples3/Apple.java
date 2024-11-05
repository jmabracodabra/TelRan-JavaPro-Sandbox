package com.example.de.lesson2_Inheritance.examples3;

public class Apple extends Fruit{

    public Apple(String title, int weight, String color) {
        super(title, weight, color);
    }

    public Apple(String title, int weight) {
        super(title, weight);
    }

    @Override
    public boolean isRipe() {
        //вернуть результат работы метода родительского класса
        //return super.isRipe();
        return false;
    }
}
