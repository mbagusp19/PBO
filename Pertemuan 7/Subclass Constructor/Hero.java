package com.pboreg;

public class Hero {

    String name;
    double defencePower;

    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    Hero(String name){
        this.name = name;
    }

    void display() {
        System.out.println("Nama Hero = " + this.name);
        System.out.println("Defense = " + this.defencePower);
        System.out.println(" ");
    }
}