package com.classes.syntaxoops;

public class EvenOfOdd {
    void EvenOfOddNumber(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }

    public static void main(String[] args) {
        EvenOfOdd evenOfOdd=new EvenOfOdd();
        evenOfOdd.EvenOfOddNumber(25);
    }
}
