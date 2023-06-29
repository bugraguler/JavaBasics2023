package com.classes.javainterviewprep;

public class PairBracketsTester {
    public static void main(String[] args) {

        PairBrackets pairBrackets = new PairBrackets();
        System.out.println(pairBrackets.isBracketsPair(")"));
        System.out.println(pairBrackets.isBracketsPair("()"));
        System.out.println(pairBrackets.isBracketsPair("(()"));
        System.out.println(pairBrackets.isBracketsPair("(())"));
        System.out.println(pairBrackets.isBracketsPair(")()("));
    }
}
