package com.pboreg;

// inheritance adalah hubungan is-a
public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Bagus";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Fadil";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Arya";
        hero3.display();
    }
}