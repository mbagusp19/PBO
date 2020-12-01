package com.pboreg;

public class CthRuntimeException extends RuntimeException{
    static void a() {
        throw new RuntimeException("Mulai dari a()");
    }
    static void b() {
        a();
    }
    public static void main(String[] args) {
        b();
    }
}