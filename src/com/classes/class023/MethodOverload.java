package com.classes.class023;

public class MethodOverload {
    void method(){
        System.out.println("0");
    }
    public  void method(String name){
        System.out.println("1");
    }
    private void method(int age){
        System.out.println("2");
    }

    public static void main(String[] args) {
         MethodOverload methodOverload= new MethodOverload();
         methodOverload.method();
         methodOverload.method("ali");
         methodOverload.method(12);
    }
}
