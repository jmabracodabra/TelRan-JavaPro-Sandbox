package com.example.de.Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polindrom {

    //1. Напишите метод, чтобы проверить, является ли данная строка палиндромом. ~ ABCDCBA, madam, racecar
    //2. Напишите метод, который меняет местами элементы одномерного списка из String в обратном порядке.
    //Не используйте дополнительный список для хранения результатов.

//    Имеется заданный список имен студентов:
//    List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
//   - Написать метод findNameStartingWith(), который бы возвращал список имен, начинающихся на определенную букву

//4. Составить список студентов, распределенных по отдельным классам List<List<Student>> studentGrades
//   - Написать метод countTotalAmount(), который считает общее число студентов
//   - Написать метод countAmountWithName(String name), который считает количество студентов в школе с заданным именем name.

    public static void main(String[] args) {
        String str = "ABCDCBA";
        System.out.println(isPolindrom(str));

        List<String> list = new ArrayList<>(List.of("One", "Two", "Three"));

        System.out.println(list);

        swap(list);
        System.out.println(list);

        List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");

        System.out.println(findNameStartingWith(names, "T"));

    }

    private static boolean isPolindrom(String str) {

        char[] arr = str.toCharArray();

        int j = arr.length;
        for (int i = 0; i < j; i++) {
            if (!(arr[i] == arr[j - 1])) {
                return false;
            }
            j--;
        }
        return true;
    }

    private static void swap(List<String> list) {
        String temp;
        for (int i = 0; i < list.size() / 2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    //    Имеется заданный список имен студентов:
    //    List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
    //   - Написать метод findNameStartingWith(), который бы возвращал список имен, начинающихся на определенную букву
    private static List<String> findNameStartingWith(List<String> list, String letter) {
        List<String> namesStartWith = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != null && list.get(i).startsWith(letter)) {
                namesStartWith.add(list.get(i));
            }
        }
        return namesStartWith;
    }
}
