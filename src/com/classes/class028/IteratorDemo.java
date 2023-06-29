package com.classes.class028;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> coursis = new LinkedList<>();
        coursis.add("SDLC");
        coursis.add("Manuel Testing");
        coursis.add("Java");
        coursis.add("Java");
        coursis.add("Selenium");
        System.out.println(coursis);
        for (int i = 0; i < coursis.size(); i++) {
            if(coursis.get(i).equals("Java")){
                coursis.remove("Java");
            }
        }
        System.out.println(coursis);
    }
}
