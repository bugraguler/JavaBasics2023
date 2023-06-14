package com.classes.syntaxoops;

public class Calculator {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void greeting(String nameIt) {
        System.out.println(nameIt + " hello babe");
    }

    void greet5times(String name,int repeat){
        for(int i=0;i<repeat;i++){
            System.out.print(name+" ");
        }
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(45, 36);
        calculator.greeting("Ali");
        calculator.greet5times("Osman",4);
    }
}
