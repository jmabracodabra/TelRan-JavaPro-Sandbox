package com.example.de.practice12_12;

import java.util.Objects;

public class Triangle extends Shape implements Comparable<Triangle> {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(a, triangle.a) == 0 && Double.compare(b, triangle.b) == 0 && Double.compare(c, triangle.c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public int compareTo(Triangle o) {
        int resultA = Double.compare(this.a, o.getA());
        if (resultA != 0) {
            return resultA;
        }

        int resultB = Double.compare(this.b, o.getB());
        if (resultB != 0) {
            return resultB;
        }
        return Double.compare(this.c, o.getC());
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle with sides " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                " has a square = " + this.calculateArea();
    }
}
