package com.example.de.lesson1;

public class StudentApp {

    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.name = "Alex";
        studentOne.age = 25;
        System.out.println("Student's one info: " + studentOne.name + ", " + studentOne.age);


        Student studentTwo = new Student("Max");
        studentTwo.age = 24;
        System.out.println("Student's two info: " + studentTwo.name + ", " + studentTwo.age);

        Student studentThree = new Student("Ivan", 27);
        System.out.println("Student's three info: " + studentThree.name + ", " + studentThree.age);

    }
}
