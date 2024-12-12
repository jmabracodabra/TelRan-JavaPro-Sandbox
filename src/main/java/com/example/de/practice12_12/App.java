package com.example.de.practice12_12;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Создать набор классов для хранения геометрических фигур:
 * прямоугольник, квадрат, круг, треугольник (пусть для простоты будет только прямоугольный)
 * 2. Реализовать методы equals() и hashcode() у них.
 * 3. Составить TreeSet и HashSet из геометрических фигур
 * 4. Добавить метод вычисления площади фигур.
 * 5. Составить список из разных геометрических фигур и отсортировать его по площади
 */
public class App {

    public static void main(String[] args) {

        Set<Rectangle> rectangles = new HashSet<>();
        rectangles.add(new Rectangle(22, 31));
        rectangles.add(new Rectangle(12, 11));
        rectangles.add(new Rectangle(22, 31));
        rectangles.add(new Square(11));
        rectangles.add(new Rectangle(11,11));


        System.out.println(rectangles);

        Set<Rectangle> rectangles1 = new TreeSet<>();
        rectangles1.add(new Rectangle(31, 2));
        rectangles1.add(new Rectangle(4, 8));
        rectangles1.add(new Rectangle(1.4, 4));
        rectangles1.add(new Rectangle(4, 8));
        rectangles1.add(new Square(2.1));
        rectangles1.add(new Rectangle(2.1, 2.1));


        System.out.println(rectangles1);

        Set<Shape> shapes = new TreeSet<>(new SortByArea());
        shapes.add(new Circle(3));
        shapes.add(new Triangle(2,4,5));
        shapes.add(new Rectangle(2,4));
        shapes.add(new Square(3));
        shapes.add(new Circle(5));
        shapes.add(new Circle(3));

        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
