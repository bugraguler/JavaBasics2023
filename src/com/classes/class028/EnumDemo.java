package com.classes.class028;

public class EnumDemo {
    enum Level{
        LOW,
        MEDIUM,
        HIGH,
    }

    public static void main(String[] args) {
        Level myVar=Level.HIGH;
        System.out.println(myVar);
    }
}
