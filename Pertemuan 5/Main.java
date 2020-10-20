package com.pboreg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bilangan obil = new Bilangan();
        System.out.println("Nilai A = " + obil.tampilkana());
        System.out.println("Nilai B = " + obil.tampilkanb());
        System.out.println("Nilai C = " + obil.tampilkanc());

        System.out.println(" ");

        // Nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkana());
        // Nilai B diinput
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkanb());
        // Nilai C diinput
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkanc());

        System.out.println(" ");

        // panggil method tambah()
        System.out.println("Hasil Pertambahan = " + obil.tambah());
        // panggil method kurang()
        System.out.println("Hasil Pengurangan = " + obil.kurang());
        // panggil method kali()
        System.out.println("Hasil Perkalian = " + obil.kali());
        // panggil method bagi()
        System.out.println("Hasil Pembagian = " + obil.bagi());

        System.out.println(" ");

        //panggil method inputData
        obil.inputData(3,5, 2);
        System.out.println("Hasil Pertambahan = " + obil.tambah());
    }
}
