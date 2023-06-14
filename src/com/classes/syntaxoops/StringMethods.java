package com.classes.syntaxoops;

public class StringMethods {
    String str = new String("banane");

    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();
        System.out.println(stringMethods.str);
        String sentences= "Bu işlerden Banane babacım Banane";
        boolean b= sentences.contains(stringMethods.str);
        System.out.println(b);
        String phoneNumber ="+32472866821";
        System.out.println("0"+phoneNumber.substring(3));


    }

}
