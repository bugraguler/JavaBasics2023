package com.classes.syntaxoops;

public class ReverseMethodbq {
    String reverseMeth(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);

        }
        return reverseStr;
    }

    String reverse2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.reverse().toString();
        return str;
    }

}
