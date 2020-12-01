package com.pboreg;

public class CthNumberFormatException {

    private static final String inputString = "191.91";

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(inputString);
        }catch(NumberFormatException ex){
            System.err.println("String tidak valid");
        }
    }
}