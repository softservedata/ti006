package com.softserve.edu03sort;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (3.14 * (radius * radius));
    }

}
