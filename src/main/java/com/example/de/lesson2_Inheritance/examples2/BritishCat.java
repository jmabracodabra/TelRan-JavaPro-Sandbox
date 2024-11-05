package com.example.de.lesson2_Inheritance.examples2;

public class BritishCat extends Cat{

    private String breed;

    public void printCatInfo(){
        //super - обращение к переменной, методу, конструктору родительского класса
        //this - обращение к переменной, методу, конструктору текущего класса
        System.out.println("Cat name is " + getName() + ", breed is " + super.breed);
    }
}
