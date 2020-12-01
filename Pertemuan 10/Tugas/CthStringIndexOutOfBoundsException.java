package com.pboreg;

public class CthStringIndexOutOfBoundsException {
    public static void main(String args[])
    {
        try{
            String str="Buku";
            System.out.println(str.length());;
            char c = str.charAt(0);
            c = str.charAt(25);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }
    }
}
