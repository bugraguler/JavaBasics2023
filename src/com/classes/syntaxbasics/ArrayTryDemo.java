package com.classes.syntaxbasics;

public class ArrayTryDemo {
    public static void main(String[] args) {
        int numbers []= {1,4,7,5};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.print(sum);
    }
}
