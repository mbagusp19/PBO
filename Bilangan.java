package com.pboreg;

public class Bilangan {
    //Atribute
    private int a = 10; //Atribute ini tdk boleh diakses secara langsung dr luar classku
    private int b = 20; //Atribute ini tdk boleh diakses secara langsung dr luar classku
    private int c = 30; //Atribute ini tdk boleh diakses secara langsung dr luar classku

    //method
    public int tampilkana(){return this.a;}
    public int tampilkanb(){return this.b;}
    public int tampilkanc(){
        return this.c;
    }
    public void inputData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void inputA(int nilai) {
        this.a = nilai;
    }
    public void inputB(int nilai) {
        this.b = nilai;
    }
    public void inputC(int nilai) {
        this.c = nilai;
    }
    public int tambah() {
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    public int kurang() {
        int hasil = this.a - this.b;
        return hasil;
    }
    public int kali() {
        int hasil = this.a * this.c;
        return hasil;
    }
    public double bagi() {
        double hasil = (double) this.a / (double) this.b;
        return hasil;
    }
}
