package com.example.de.lesson2_Inheritance.examples2;

public class Cat {

    private String name;

    private int age;

    //доступ только у наследников и внутри класса
    protected String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
