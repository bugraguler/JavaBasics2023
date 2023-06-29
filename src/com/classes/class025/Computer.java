package com.classes.class025;

public abstract class Computer {
    String brand;
    int ram;

    public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void hasOffice() {
        System.out.println("all have office by default");
    }

    abstract void setBrand();
}

class Dell extends Computer {


    public Dell(String brand, int ram) {
        super(brand, ram);
    }

    void setBrand() {
        System.out.println("brand is "+brand +" and the ram is "+ram);
    }
}

class Toshiba extends Computer {


    public Toshiba(String brand, int ram) {
        super(brand, ram);
    }

    void setBrand() {
        System.out.println("brand is "+brand +" and the ram is "+ram);
    }
}

class Test {
    public static void main(String[] args) {
        Computer[] computers = {new Toshiba("Toshiba",16), new Dell("Dell",8)};
        for (Computer computer:computers) {
            computer.setBrand();
            computer.hasOffice();
        }
    }
}