package com.pboreg;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollection {
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Bagus");
        al.add("Fadil");
        al.add("Reno");

        Iterator it = al.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}