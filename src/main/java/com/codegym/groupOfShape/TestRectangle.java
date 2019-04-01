package com.codegym.groupOfShape;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(10, 15);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle("pink", true, 5, 14);
        System.out.println(rectangle3);

    }
}
