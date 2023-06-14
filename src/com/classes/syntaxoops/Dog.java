package com.classes.syntaxoops;

public class Dog {
    String name;
    String colour;
    int age;
    char gender;
    void bark(){
        System.out.println(name+colour+gender+"Dog barks");
    }


    public static void main(String[] args) {
        Dog scooby=new Dog();
        scooby.name="Scooby";
        scooby.colour="Brown";
        scooby.gender='m';
        scooby.bark();
        //System.out.println(scooby.name+" "+scooby.colour+" "+ scooby.gender);
    }
}
