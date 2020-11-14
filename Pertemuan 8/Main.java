package com.pboreg;
// class Abstract
abstract class Hewan {
    //Abstract Method (tidak memiliki body/visi dari method)
    public abstract void suaraHewan();

    //Regular Method
    public void tidur() {
        System.out.println("Zzz....");
    }
}
//Subclass (turunan dari class Hewan)
class Ayam extends Hewan {
    public void suaraHewan() {
        //body dari abstract method suaraHewan() ditulis disini
        System.out.println("Kuukuruyuuukkk....");
    }
}
class Kucing extends Hewan {
    public void suaraHewan() {
        //body dari abstract method suaraHewan() ditulis disini
        System.out.println("Meow...Meow....");
    }
}
public class Main {
    public static void main(String[] args) {
	// write your code here
        Ayam ayamku = new Ayam(); //membuat objek Ayam
        ayamku.suaraHewan();
        ayamku.tidur();
        Kucing kucingku = new Kucing(); //membuat objek Ayam
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
