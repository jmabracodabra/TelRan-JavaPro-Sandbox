package com.example.de.practice12_12;

import java.util.Comparator;

public class SortByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.calculateArea(), o2.calculateArea());
    }
}
