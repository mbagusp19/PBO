package com.pboreg;

class Outer_Class{
    int x = 10;

    static class InnerClass{
        int y = 5;
    }
}

public class Static_Inner_Class {
    public static void main(String[] args) {
        Outer_Class myOuter = new Outer_Class();
        Outer_Class.InnerClass myInner = new Outer_Class.InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}