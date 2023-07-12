package com.classes.javainterviewprep;

public class ExceptionHandelingDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int result;
        try{
            result=a/b;
        }catch(ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
    }
}
