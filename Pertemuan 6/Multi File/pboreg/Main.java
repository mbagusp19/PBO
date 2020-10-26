package com.pboreg;

// keyword import untuk package eksternal
import com.terminal.Console;

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Bagus");
        Player player2 = new Player("Arya");
        Player player3 = new Player("Fadil");
        player1.show();
        player2.show();
        player3.show();

        Console.log("hallo");
        Console.log("Hallo");
    }
}