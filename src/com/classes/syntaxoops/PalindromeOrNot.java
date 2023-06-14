package com.classes.syntaxoops;

public class PalindromeOrNot {
    boolean isItPalindrome(String str){
        StringBuilder stringBuilder= new StringBuilder(str);
        String newStr=stringBuilder.reverse().toString();
        if(str.equalsIgnoreCase(newStr)){
            return true;
        }else{
            return false;
        }

    }
}
