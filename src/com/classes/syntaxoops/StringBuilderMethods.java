package com.classes.syntaxoops;

public class StringBuilderMethods {
    public static void main(String[] args) {
        String str= new String("This is number #16511954122");
        System.out.println(str.indexOf('#'));
        System.out.println(str.replaceAll("1","*"));
        System.out.println("**************************************");
        String[] strArr=str.split(" ");
        for (String s:strArr) {
            System.out.println(s);
        }
        StringBuilder stringBuilder=new StringBuilder("This is a good day");
        System.out.println(stringBuilder.reverse());

        StringBuilder ss= new StringBuilder();
        for (int i = 0; i <1000; i++) {
            ss.append(i);
        }
        System.out.println(ss);

    }
}
