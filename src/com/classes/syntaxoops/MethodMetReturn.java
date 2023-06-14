package com.classes.syntaxoops;

public class MethodMetReturn {
    int doubleIt (int num){
        return num*2;
    }

    public static void main(String[] args) {
        MethodMetReturn methodMetReturn=new MethodMetReturn();
        int result=methodMetReturn.doubleIt(5) ;
        System.out.println(result);
    }
}
