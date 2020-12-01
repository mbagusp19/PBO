package com.pboreg;

public class CthClassNotFoundException {

    public static void main(String[] args) {
        try
        {
            Class.forName("Class");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error " + ex);
        }
    }
}