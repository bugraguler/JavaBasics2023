package com.classes.class028;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("b");
        letters.add("d");
        letters.add("p");
        letters.add("z");
        letters.add("a");
        letters.add("a");
        letters.add("a");
        System.out.println(letters);
    // casting :)
        LinkedHashSet<String>linkedHashSetLetters= new LinkedHashSet<>(letters);
        System.out.println(linkedHashSetLetters);
        TreeSet<String>treeSetLetters= new TreeSet<>(letters);
        System.out.println(treeSetLetters);



    }
}
