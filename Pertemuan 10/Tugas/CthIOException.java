package com.pboreg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CthIOException {
    public static void main(String[] args) {
        try {
            File file = new File("Program.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}