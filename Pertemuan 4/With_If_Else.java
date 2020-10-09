package com.pboreg;

public class With_If_Else {

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Acces denied - You are not old enough!");
        } else {
            System.out.println("Acces granted - You are old enough!");
        }
     }
        public static void main(String[] args) {
        checkAge(20);
     }
    }
