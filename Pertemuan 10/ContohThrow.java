package com.pboreg;

public class ContohThrow {
    public static void main(String[] args) {
        try {
            int umur = 20;
            if (umur < 18) {
                throw new ArithmeticException("Access denied");
            } else {
                System.out.println("Access granted");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}