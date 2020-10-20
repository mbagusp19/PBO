package com.pboreg;

class Classku {
    //Atribute
    public int x = 5; //Atribute ini tdk boleh diakses secara langsung dr luar classku
    int y = 15; //Atribute ini bisa diakses secara langsung dr luar classku dalam 1 package
    private int z = 20; //Atribute ini tdk boleh diakses secara langsung dr luar classku

    //method
    public int tampilkanz(){
        return this.z;
    }
}
