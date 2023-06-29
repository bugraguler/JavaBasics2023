package com.classes.class023;

public class DogTester {
    public static void main(String[] args) {
        Dog dog= new Dog();
        System.out.println(dog);
        Dog dog1= new Dog("johny","sam");
        System.out.println(dog1);
        dog1.changeInfo("Assa","keese");
        System.out.println(dog1);

    }
}
