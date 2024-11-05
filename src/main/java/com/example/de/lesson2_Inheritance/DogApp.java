package com.example.de.lesson2_Inheritance;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bars");
        System.out.println("Dog's name is " + dog.getName());
        dog.voice();

        SmallDog smallDog = new SmallDog();
        smallDog.setName("Little");
        System.out.println("Dog's name is " + smallDog.getName());
        smallDog.voice();
        smallDog.jump();

        BigDog bigDog = new BigDog();
        bigDog.setName("Big");
        System.out.println("Dog's name is " + bigDog.getName());
        bigDog.voice();
        System.out.println("\nVoices in array: ");
        //
        //наследников можно помещать в массив под родительским типом
        //пытаемся создать
        Dog[] dogs = {dog, smallDog, bigDog};
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].voice();
        }

    }
}
