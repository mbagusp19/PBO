package com.pboreg;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // Switch Case
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil Nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "Bagus":
                System.out.println("Saya Bagus Hadir!!!");
                break;
            case "Arya":
                System.out.println("Saya Arya Hadir!!!!");
                break;
            case "Dika":
                System.out.println("Saya Dika Hadir!!!!");
                break;
            default:
                System.out.println(input + " Tidak Hadir!!!");
        }

        System.out.println("Selesai Program");
    }
}