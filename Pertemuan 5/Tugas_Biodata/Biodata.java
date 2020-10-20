package com.pboreg;

public class Biodata {

    private String Nama = "Aryadani";
    private int NIM = 2019071039;
    private String Jurusan = "Informatika";
    private int Angkatan = 2019;

    public void inputNama(String Biodata) { this.Nama = Biodata; }
    public void inputNIM(int Biodata) { this.NIM = Biodata; }
    public void inputJurusan(String Biodata) { this.Jurusan = Biodata; }
    public void inputAngkatan(int Biodata) { this.Angkatan = Biodata;}

    public String tampilkanNama(){return this.Nama;}
    public int tampilkanNIM(){return this.NIM;}
    public String tampilkanJurusan(){return this.Jurusan;}
    public int tampilkanAngkatan(){return this.Angkatan;}
}