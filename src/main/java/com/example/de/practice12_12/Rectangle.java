package com.example.de.practice12_12;

import java.util.Objects;

public class Rectangle extends Shape implements Comparable<Rectangle> {

    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width +
                " and height = " + height +
                " has square = " + this.calculateArea();
    }

    @Override
    public int compareTo(Rectangle o) {
        int result = Double.compare(this.width, o.getWidth());
        if (result != 0) {
            return result;
        }
        return Double.compare(this.height, o.getHeight());
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
