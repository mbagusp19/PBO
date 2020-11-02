package com.pboreg;

public class HeroStrength extends Hero{
    double defencePower;

    // overriding methods
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Nama Hero : " + this.name);
        System.out.println("Kekuatan Bertahan : " + this.defencePower);
    }
}