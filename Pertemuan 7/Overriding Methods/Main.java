package com.pboreg;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Sasuke";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Naruto";
        hero2.defencePower = 100;
        hero2.display();
    }
}
