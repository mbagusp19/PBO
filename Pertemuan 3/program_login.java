package com.pboreg;

import java.util.Scanner;

public class program_login {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan username = ");
        String user = inputUser.next();
        System.out.print("Masukkan password = ");
        String pass = inputUser.next();

        while (!(user.equals("bagus") && pass.equals("pratama"))) {

            System.out.println("Username atau Password salah");

            System.out.print("Masukkan username = ");
            user = inputUser.next();
            System.out.print("Masukkan password = ");
            pass = inputUser.next();
        }
        System.out.println("Username dan Password benar");
    }
}