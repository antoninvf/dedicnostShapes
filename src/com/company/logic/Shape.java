package com.company.logic;

public class Shape {

    protected float a;
    protected float b;
    protected float c;
    protected float v;
    protected float r;

    public Shape(float a, float b, float c, float v, float r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.v = v;
        this.r = r;
    }

    public float perimeter() {
        return 0;
    }

    public float area() {
        return 0;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getV() {
        return v;
    }

    public float getR() {
        return r;
    }
}
