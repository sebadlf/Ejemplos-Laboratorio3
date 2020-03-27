package com.company;

public class Circle {
    private static int counter = 0;

    public static final float PI = 3.14159f;

    private float radio;

    public Circle(float radio) {
        this.radio = radio;

        Circle.counter++;
        //this.counter++;
    }

    public static int getCounter() {
        return Circle.counter;
    }

    public float getSuperficie() {
        return this.PI * this.radio * this.radio;
    }

    public float getPerimetro() {
        return this.PI * 2 * this.radio;
    }
}
