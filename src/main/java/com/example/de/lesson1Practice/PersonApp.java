package com.example.de.lesson1Practice;

public class PersonApp {

    public static void main(String[] args) {
        Person one = new Person("Alex", "Petrov", 30, "petrov@gmail.com");
        Person two = new Person("Max", "Maksimov", 26, "maksimov@gmail.com");

        Passport onePass = new Passport("222222", "2020-10-10", "2030-10-10");
        Passport twoPass = new Passport("111111", "2010-11-10", "2020-11-10");
        Passport olegPassport = new Passport("333333", "2015-11-10", "2025-11-10");

        Person three = new Person("Oleg", "Olegov", 20, "olegov@mail.com", olegPassport);

        one.setPassport(onePass);
        two.setPassport(twoPass);

        Person[] people = {one, two};

//        for (int i = 0; i < people.length; i++) {
//            Person person = people[i];
//            System.out.println("Person : " + person.getName() + " " + person.getSurname() +
//                    " , with age " + person.getAge() + " , contact email " + person.getEmail());
//        }

        // for(TypeElementOfArray nameVariable : array) {
        //   в каждой итерации цикла , в переменную nameVariable
        //   будет записываться очередной элемент массива
        // }

        System.out.println("Before age is changed");
        for (Person person : people) {
            person.printInfo();
        }

        one.setAge(31);
        two.setAge(25);

        System.out.println("After age is changed");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        three.showPassport();

    }
}
