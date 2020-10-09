package com.pboreg;

public class Nested_If {

    public static void main(String[] args){


        // Nested If atau If Bersarang
        int a = 2;
        int b = 10;

        System.out.println("Ini adalah awal dari program");

        if (a == 5){

            if (b == 10){

                System.out.println("Ini adalah dimana a = 5 dan b = 10");

            } else {

                System.out.println("Ini adalah dimana a = 5 dan b bukan 10");

            }

        } else {

            System.out.println("Ini adalah dimana a salah");

        }

        System.out.println("Ini adalah akhir dari program");
    }
}