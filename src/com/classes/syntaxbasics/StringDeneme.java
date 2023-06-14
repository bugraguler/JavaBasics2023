package com.classes.syntaxbasics;

import java.util.Arrays;

public class StringDeneme {
    public static void main(String[] args) {
        String mesaj="Bugun gava efsane";
        System.out.println(mesaj.concat(" naber"));
        char[]karakters=new char[6];
        mesaj.getChars(0,6,karakters,0);
        System.out.println(karakters);
        System.out.println(mesaj.indexOf("un"));
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.replace('a','i'));
        System.out.println(mesaj.length());
        System.out.println(mesaj.split(" ")[0]);
        System.out.println(mesaj.substring(2));
        String [] s=mesaj.split(" ");
        System.out.println(Arrays.toString(s));
        String kelime ="12345678/-++++//%%&9asdfghjkl4568741ğişlkdjhkg";
        System.out.println(kelime.replaceAll("[1-5]","*"));
        System.out.println(kelime.replaceAll("[0-9a-zA-Z]","*"));
        System.out.println(mesaj.toLowerCase());
        System.out.println("git deneme");

    }
}
