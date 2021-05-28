package com.company.logic;

public class Circle extends Shape {

    private final float PI = (float) Math.PI;

    public Circle(float r) {
        super(0, 0, 0, 0, r); // a, b, c, v, r
    }

    @Override
    public float perimeter() {
        return (2 * PI * r);
    }

    @Override
    public float area() {
        return (PI * (r * r));
    }
}