package com.classes.class033;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("Opening the application");
        System.out.println("Displaying the welcomw message");
        System.out.println("User is trying to use feature 1");
        System.out.println("User is trying to use feature 2");
        try {
            System.out.println(10 / 0);
        } catch (Exception exception) {
            System.out.println("you can not divide a number to 0");
            System.out.println(exception);
        } finally {
            System.out.println("User is trying to use feature 3");
            System.out.println("User is trying to use feature 4");
            System.out.println("User is trying to use feature 5");
        }
    }
}

