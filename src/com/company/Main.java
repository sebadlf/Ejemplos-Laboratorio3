package com.company;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(2);

        // System.out.println(String.format("C1 = %s - Circle = %s", c1.getCounter(), Circle.getCounter()));

        Circle c2 = new Circle(3);

        // System.out.println(String.format("C1 = %s - C2 = %s - Circle = %s", c1.getCounter(), c2.getCounter(), Circle.getCounter()));

        System.out.println(String.format("%s - %s", c1.getSuperficie(), c2.getSuperficie()));

        //Circle.PI = 3.14159f;
        System.out.println(String.format("%s - %s", c1.getSuperficie(), c2.getSuperficie()));


    }
}
