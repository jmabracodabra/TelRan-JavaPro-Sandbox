package com.example.de.lesson1;

public class Student {

    String name;

    int age;


    public Student() {

    }

    public Student(String studentName) {
        name = studentName;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }
}
