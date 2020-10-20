package com.pboreg;

public class Multiple_Object {
    int x = 5;

    public static void main(String[] args) {
        Multiple_Object myObj1 = new Multiple_Object(); // Object 1
        Multiple_Object myObj2 = new Multiple_Object(); // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x); // Outputs 5
        System.out.println(myObj2.x); // Outputs 25
    }
}