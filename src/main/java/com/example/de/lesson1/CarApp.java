package com.example.de.lesson1;

//Write code -> compile to byte code -> run on VM
public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.model = "VW";
        carOne.color = "Red";

        Car carTwo = new Car();
        carTwo.model = "Audi";
        carTwo.color = "Black";

        Car carThree = new Car();
        carThree.model = "VW";
        carThree.color = "Red";

        carOne.startEngine();
        carTwo.startEngine();
    }
}
