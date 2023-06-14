package com.classes.syntaxoops2;

public class Car {
    String name;
    String make;
    String colour;
    String model;

    public Car(String name, String make, String colour, String model) {
        this(name, make);
        this.colour = colour;
        this.model = model;
    }

    public Car(String name, String make) {
        this.name = name;
        this.make = make;
    }

    void PrintCar() {
        System.out.println(name+make+colour+model);
    }
}
