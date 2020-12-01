package com.pboreg;

public class ContohNestedException2 {
    public static void main(String[] args) {
        try { //Parent try-block
            try { //Child try-block1
                System.out.print("Di dalam child block 1 ");
                int b = 30 / 0;
                System.out.println(b);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception ");
                System.out.println("pada child try-block1");
            }
            try {
                System.out.print("Di dalam child block 2 ");
                int b = 40 / 0;
                System.out.println(b);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Arithmetic Exception ");
                System.out.println("pada child try-block2");
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
            System.out.println("ditangani pada parent try-block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arithmetic Exception ");
            System.out.println("ditangani pada parent try-block");
        } catch (Exception e) {
            System.out.println("Arithmetic Exception ");
            System.out.println("ditangani pada parent try-block");
        }
        finally {
            System.out.println("Next Statement...");
        }
    }
}
