package com.pboreg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        Biodata bio = new Biodata();

        System.out.println("Masukan biodata anda");
        System.out.println(" ");

        System.out.print("Nama: ");
        String Nama = inputUser.nextLine();
        System.out.print("NIM: ");
        String Nim = inputUser.next();
        System.out.print("Jurusan: ");
        String Jurusan = inputUser.next();
        System.out.print("Angkatan: ");
        String Angkatan = inputUser.next();

        System.out.println(" ");
        System.out.println("Biodata setelah diinput");
        System.out.println(" ");

        System.out.println("Nama: " + bio.tampilkanNama());
        bio.inputNama("Muhammad Bagus Pratama");
        System.out.println("NIM: " + bio.tampilkanNIM());
        bio.inputNIM(2019071038);
        System.out.println("Jurusan: " + bio.tampilkanJurusan());
        bio.inputJurusan("Informatika");
        System.out.println("Angkatan: " + bio.tampilkanAngkatan());
        bio.inputAngkatan(2019);

        System.out.println(" ");

        System.out.println("Nama: " + bio.tampilkanNama());
        System.out.println("NIM: " + bio.tampilkanNIM());
        System.out.println("Jurusan: " + bio.tampilkanJurusan());
        System.out.println("Angkatan: " + bio.tampilkanAngkatan());

    }
}
