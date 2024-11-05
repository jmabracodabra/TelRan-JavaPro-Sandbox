package com.example.de.lesson1Practice;

public class PersonApp2 {

    public static void main(String[] args) {
        Person one = new Person("Alex", "Petrov", 30, "petrov@gmail.com");
        Passport onePass = new Passport("222222", "2020-10-10", "2030-10-10");
        one.setPassport(onePass);

        System.out.println("Person : " + one.getName() + " " + one.getSurname() +
                " , with age " + one.getAge() + " , contact email " + one.getEmail()
                + " passport: " + one.getPassport().getInfo());
    }

}
