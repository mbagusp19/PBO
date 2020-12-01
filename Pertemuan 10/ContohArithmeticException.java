package com.pboreg;

import java.util.Scanner;

class Bilangan {
    private int a;
    private int b;
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void hasil() {
        int hasil = 0;

        try {
            hasil = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e);
        }
        System.out.print("Hasil: " + hasil);
    }
}

public class ContohArithmeticException {

    public static void main(String[] args) {
	// write your code here
        Bilangan bil = new Bilangan();
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int hasil = 0;

        System.out.print("Masukan bilangan ke-1: ");
        a = input.nextInt();
        bil.setA(a);
        System.out.print("Masukan bilangan ke-2: ");
        b = input.nextInt();
        bil.setB(b);
        bil.hasil();
        System.out.print("Terima kasih");

    }
}
