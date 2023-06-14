package com.classes.syntaxoops2;

public class Parent {
    String name = "Parent";
    int age = 52;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent {
    String name = "Child";
    int age = 25;

    public Child(String name, int age) {
        super(name, age);
    }


    void PrintNames() {
        String name = "Local";
        System.out.println(name + " " + age);
        System.out.println(this.name + " " + this.age);
        System.out.println(super.name + " " + super.age);
    }

    public static void main(String[] args) {
        Child child = new Child("Bugra",34);
        child.PrintNames();
    }
}

