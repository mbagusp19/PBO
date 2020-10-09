package com.pboreg;

public class Kalkulasi {
    static int plusMethod (int x, int y) {
        return x + y;
    }
    static double plusMethod (double x, double y) {
        return x - y;
    }
    static String plusMethod (String x, String y) {
        String hasil = x + " " + y; // Variable Local

        return hasil;
    }
    static String plusMethod (String x, int y) {
        String hasil = "Nama " + x + ", umur " + y + " tahun";
        return hasil;
    }
    public static void main(String[] args) {

        String nilai3 = plusMethod("Bagus", "Pratama");
        int nilai1 = plusMethod(8, 5);
        double nilai2 = plusMethod(4.3, 6.26);
        String nilai4 = plusMethod("Bagus", 17);
        System.out.println("Nilai int = " + nilai1);
        System.out.println("Nilai double = " + nilai2);
        System.out.println("Nilai String = " + nilai3);
        System.out.println("Keterangan = " + nilai4);
    }
}
