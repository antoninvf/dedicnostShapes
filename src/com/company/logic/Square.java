package com.company.logic;

public class Square extends Shape {

    public Square(float a) {
        super(a, 0, 0, 0, 0); // a, b, c, v, r
    }

    @Override
    public float perimeter() {
        return a * 4;
    }

    @Override
    public float area() {
        return a * a;
    }
}
