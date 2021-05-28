package com.company.logic;

public class Rectangle extends Shape {

    public Rectangle(float a, float b) {
        super(a, b, 0, 0, 0); // a, b, c, v, r
    }

    @Override
    public float perimeter() {
        return 2 * (a + b);
    }

    @Override
    public float area() {
        return a * b;
    }
}
