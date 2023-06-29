package com.classes.class029;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
         TreeSet<Character> letters= new TreeSet();
         letters.add('A');
         letters.add('c');
         letters.add('a');
         letters.add('r');
        System.out.println(letters);

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Onion");
        vegetables.add("Onion");
        vegetables.add("Carrot");
        System.out.println(vegetables);

        HashSet<String>vegetab= new HashSet<>(vegetables);
        System.out.println(vegetab);
        vegetab.clear(); // removing all the original elements
        System.out.println(vegetab);
        vegetab.addAll(vegetables);//add all unique with the insertion order
        System.out.println(vegetab);
        vegetab.remove("Onion");
        System.out.println(vegetab);



    }
}
