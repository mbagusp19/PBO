package com.pboreg;

import java.util.Scanner;

public class TugasArrayP9 {
    public static void main(String[] args)

    {
        int n, x, data = 0, i = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bilangan: ");
        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Masukkan Data: ");

        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Masukkan Data yang ingin dicari: ");
        x = s.nextInt();

        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                data = 1;
                break;
            }
            else
            {
                data = 0;
            }
        }
        if(data == 1)
        {
            System.out.println("Data ketemu: "+(i + 1));
        }
        else
        {
            System.out.println("Data tidak ketemu");
        }
    }
}