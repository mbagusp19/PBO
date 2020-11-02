package com.pboreg;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Iron Man", 10);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Hulk", 15);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Hawkeye", 20);
        hero3.display();
    }

}