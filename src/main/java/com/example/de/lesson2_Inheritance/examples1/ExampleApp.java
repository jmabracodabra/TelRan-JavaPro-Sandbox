package com.example.de.lesson2_Inheritance.examples1;

public class ExampleApp {

    public static void main(String[] args) {
        //One -> Two -> Three

        One one = new One();
        one.methodOne();

        Two two = new Two();
        two.methodOne();
        two.methodTwo();

        Three three = new Three();
        three.methodOne();
        three.methodTwo();
        three.methodThree();

    }
}
