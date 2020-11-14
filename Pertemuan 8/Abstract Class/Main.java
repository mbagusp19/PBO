package com.pboreg;

public class Main {
    public static void main(String[] args) {
        Triangle a = new Triangle(10, 20);
        System.out.println("Area of the Triangle is " + a.getArea());
        Rectangle b = new Rectangle(5, 15);
        System.out.println("Area of the Rectangle is " + b.getArea());
    }
}