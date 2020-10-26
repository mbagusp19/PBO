package com.pboreg;

import java.util.Scanner;

class Orang {

    //Atribute
    private int _umur;
    private String _nama;
    private String golDarah;

    //Constructor
    public Orang () {
        this._nama = "";
        this._umur = 0;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    public int getUmur () {
        return this._umur;
    }

    //Method
    public void setUmur(int umur) {
        this._umur = umur;
    }

    public String getNama () {
        return this._nama;
    }

    public void setNama(String nama) {
        this._nama = nama;
    }
}
class Pegawai extends Orang {

    private String nip;
    private String jabatan;

    public Pegawai() {
        this.nip = "";
        this.jabatan = "";
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;
        String golDarah;
        String nip;
        String jabatan;

        Pegawai peg = new Pegawai();

        System.out.print("Masukkan Nama: " );
        nama = input.nextLine();
        System.out.print("Masukkan NIP: " );
        nip = input.nextLine();
        System.out.print("Masukkan Umur: " );
        umur = input.nextInt();
        System.out.print("Masukkan Golongan Darah: " );
        golDarah = input.next();
        System.out.print("Masukkan Jabatan: " );
        jabatan = input.next();

        peg.setNama(nama);
        peg.setNip(nip);
        peg.setUmur(umur);
        peg.setGolDarah(golDarah);
        peg.setJabatan(jabatan);
        System.out.print("\n");
        System.out.println("Data Pegawai" );
        System.out.println("Nama : " + peg.getNama());
        System.out.println("NIP : " + peg.getNip());
        System.out.println("Umur : " + peg.getUmur());
        System.out.println("Golongan Darah : " + peg.getGolDarah());
        System.out.println("Jabatan : " + peg.getJabatan());

    }
}
