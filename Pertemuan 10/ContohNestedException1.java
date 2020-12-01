package com.pboreg;

public class ContohNestedException1 {
    public static void main(String[] args) {
        try { //main try-block
            try { //try-block2
                try { //try-block3
                    int arrBil [] = {1,2,3,4};

                    //saya akan menampilkan array pd index diluar arrBil
                    System.out.println(arrBil[10]);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception ");
                    System.out.println("ditangani pada main try-block3");
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception ");
                System.out.println("ditangani pada main try-block2");
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
            System.out.println("ditangani pada main try-block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException ");
            System.out.println("ditangani pada main try-block");
        } catch (Exception e) { //Exception jika catch yg ditulis sebelumnya tdk dpt menangani
            System.out.println("Exception ");
            System.out.println("ditangani pada main try-block");
        }
    }
}
