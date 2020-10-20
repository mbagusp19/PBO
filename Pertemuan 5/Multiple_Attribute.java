package com.pboreg;

public class Multiple_Attribute {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Multiple_Attribute myObj = new Multiple_Attribute();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}