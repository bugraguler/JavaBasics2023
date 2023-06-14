package com.classes.syntaxoops2;

public class VariablesArgument {
    public static void main(String[] args) {
        add(10,25);

    }

    static  void add(int ... intNumbers){
        int sum =0;
        for(int i:intNumbers){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

