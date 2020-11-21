package entities;

import entities.enums.Color;

public class Circle implements Shape{
    private double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
//        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
