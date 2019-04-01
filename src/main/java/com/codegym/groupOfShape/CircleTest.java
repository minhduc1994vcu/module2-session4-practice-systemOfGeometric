package com.codegym.groupOfShape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(3);
        System.out.println(circle2);

        Circle circle3 = new Circle(5, "purple", false);
        System.out.println(circle3);
    }
}
