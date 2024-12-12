package com.example.de.practice12_12;

import java.util.Objects;

public class Circle extends Shape implements Comparable<Circle> {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(r, circle.r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(r);
    }


    public double getR() {
        return r;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.r, o.getR());
    }

    @Override
    public String toString() {
        return "Circle with a r = " + r + "has square = " + this.calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
