package com.pboreg;

import java.util.*;

class Data{
    private String nama, golDarah;
    private int umur;

    public void setUmur(int umur){ this.umur = umur; }
    public void setNama(String nama){ this.nama = nama; }
    public void setGolDarah(String golDarah){ this.golDarah = golDarah; }
    public int getUmur (){ return this.umur; }
    public String getGolDarah (){ return golDarah; }
    public String getNama (){ return this.nama   ; }

}

class Karyawan extends Data {
    String nip, jabatan;
    int gol, jam;

    public int getGolongan() { return gol; }
    public void setGolongan(int gol) { this.gol = gol; }
    public int getJam() { return jam; }
    public void setJam(int jam) { this.jam = jam; }
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
    public static double persenPajak(double a, int b){ return a / b; }

    void gaji() {
        int gapok = 0, tunjangan = 0, glembur, totalgaji, lembur;
        double gpajak;

        if (gol == 1) {
            gapok = 1486500;
            tunjangan = 300000;
        }
        if (gol == 2) {
            gapok = 1926000;
            tunjangan = 300000;
        }
        if (gol == 3) {
            gapok = 2456700;
            tunjangan = 350000;
        }
        if (gol == 4) {
            gapok = 2899500;
            tunjangan = 400000;
        }
        if (jam <= 172) {
            lembur = 0;
            System.out.println("\t MAAF ANDA TIDAK MENDAPAT UANG LEMBUR");
            System.out.println(" ");
        }
        else {
            lembur = jam - 173;
        }
        glembur = lembur * 20000;
        totalgaji = gapok + tunjangan + glembur;
        double Pajak = persenPajak(0.5, 100) * totalgaji;

        System.out.println("Gaji Pokok  = Rp. " + gapok);
        System.out.println("Tunjangan   = Rp. " + tunjangan);
        System.out.println("Gaji Lembur = Rp. " + glembur);
        System.out.println("Pajak       = Rp. " + Pajak);
        gpajak = totalgaji - Pajak;
        System.out.println(" ");
        System.out.println("\t TOTAL GAJI ANDA ADALAH = Rp. " + gpajak);
        System.out.println(" ");

    }
}

public class Gaji_Pegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        int jam, umur, gol;
        String nama, golDarah, nip, jabatan;

        System.out.println("\t MASUKKAN BIODATA ANDA");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIP : ");
        nip = input.nextLine();
        System.out.print("Golongan Darah : ");
        golDarah = input.nextLine();
        System.out.print("Jabatan : ");
        jabatan = input.nextLine();
        System.out.print("Umur : ");
        umur = input.nextInt();
        System.out.print("Jam kerja : ");
        jam = input.nextInt();
        System.out.print("Golongan Pekerja : ");
        gol = input.nextInt();
        System.out.println(" ");
        System.out.println("\t BIODATA ");

        kar.setNama(nama);
        kar.setNip(nip);
        kar.setUmur(umur);
        kar.setGolDarah(golDarah);
        kar.setJabatan(jabatan);
        kar.setJam(jam);
        kar.setGolongan(gol);

        System.out.println("Nama : " + kar.getNama());
        System.out.println("NIP : " + kar.getNip());
        System.out.println("Golongan Darah : " + kar.getGolDarah());
        System.out.println("Jabatan : " + kar.getJabatan());
        System.out.println("Umur : " + kar.getUmur());
        System.out.println("Jam Kerja : " + kar.getJam());
        System.out.println("Golongan Pekerja : " + kar.getGolongan());
        System.out.println(" ");
        System.out.println("\t GOLONGAN KE- " + gol);
        kar.gaji();

    }

}
