package com.classes.javainterviewprep;

public class PairBrackets {
    public boolean isBracketsPair(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count1++;
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ')') {
                count2++;
            }
        }
        if (count1 != 0 && count2 != 0 && count1 / count2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

