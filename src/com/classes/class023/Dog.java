package com.classes.class023;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    Dog() {
        System.out.println("zero argument");
    }

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void changeInfo(String name) {
        this.name = name;
    }

    void changeInfo(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
