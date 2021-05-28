package com.company.logic;

public class Triangle extends Shape {

    public Triangle(float a, float b, float c, float v) {
        super(a, b, c, v, 0); // a, b, c, v, r
    }

    @Override
    public float perimeter() {
        return a + b + c;
    }

    @Override
    public float area() {
        return (v * a) / 2;
    }
}
