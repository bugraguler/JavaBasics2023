package com.classes.class033;

public class DivideByZeroException {

   public static void divideNumbers(int a,int b){
       if(b>0){
       System.out.println(a/b);
       }else{
           throw new ArithmeticException("You can not divide a number by zero");
       }
   }

    public static void main(String[] args) {
        divideNumbers(4,0);
    }
}
