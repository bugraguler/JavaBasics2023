package com.classes.syntaxoops2;

public class IfElseDemo {

    int maxNumber(int a, int b) {
        /*int maxNumber;
        if (a > b) {
            maxNumber = a;
        } else {
            maxNumber = b;
        }
        return maxNumber;

         */

        int maxNumber;
        return a>b?a:b;
    }

    public static void main(String[] args) {
        IfElseDemo ifElseDemo = new IfElseDemo();
        System.out.println(ifElseDemo.maxNumber(4, 5));

    }
}