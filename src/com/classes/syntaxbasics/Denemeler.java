package com.classes.syntaxbasics;

public class Denemeler {

    public static boolean toString;

    public static void main(String[] args) {
        int[] arrayTry = {12, 53, 56, 44};
        System.out.println(arrayTry.length);
        String[] arrStr = new String[4];
        arrStr[0] = "Bg";
        arrStr[1] = "Mc";
        arrStr[2] = "hh";
        arrStr[3] = "jf";
        System.out.println(arrStr[0]);
        for (int k : arrayTry) {
            System.out.print(k+" ");
        }
    }
}
