package com.classes.class028;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> coursSyntax = new LinkedList<>();
        coursSyntax.add("SDLC");
        coursSyntax.add("Manuel Testing");
        coursSyntax.add("Java");
        coursSyntax.add("Java");
        coursSyntax.add("Selenium");
        System.out.println(coursSyntax);
        coursSyntax.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if(s.equals("Java")){
                    return "Happy";
                }else{
                    return s;
                }
            }
        });
        System.out.println(coursSyntax);

    }
}
