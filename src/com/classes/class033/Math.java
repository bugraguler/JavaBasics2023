package com.classes.class033;

public class Math {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void divide(int a ,int b){
        try{
        System.out.println(a/b);
        }catch (ArithmeticException are){
            System.out.println("you can not divide a number by 0");
        }
    }
}
