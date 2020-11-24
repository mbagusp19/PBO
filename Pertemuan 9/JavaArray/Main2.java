package com.pboreg;

import java.util.Scanner;

class ContohArray2 {
    private int[] angka;

    public ContohArray2(int jmlData) {
        //inisialisasi jumlah angka pada arraynya
        angka = new int[jmlData];
    }

    public void viewAll() {
        // jika lebih banyak menggunakan (this.angka.length)
        System.out.println("View All For");
        for (int i = 0; i < this.angka.length; i++) {
            System.out.println("Nilai " + (i + 1) + "= " +
                    this.angka[i]);
        }
    }

    public void setAngka() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data");
        for (int i = 0; i < this.angka.length; i++) {
            System.out.print("Nilai " + (i + 1) + " = ");
            this.angka[i] = sc.nextInt();
        }
    }
}
public class Main2 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int jmlBil = sc.nextInt();
        ContohArray2 arrA = new ContohArray2(jmlBil);
        arrA.setAngka();
        arrA.viewAll();
    }
}
