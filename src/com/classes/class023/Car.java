package com.classes.class023;

public class Car {
    void start() {
        System.out.println("Car starts on a push back");
    }

    void stop() {
        System.out.println("Car stops automatically");
    }
}

class BMW extends Car {
    void start() {
        System.out.println("BMW starts manually");
    }

    @Override
    void stop() {
        super.stop();
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
    }
}

