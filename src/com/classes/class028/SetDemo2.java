package com.classes.class028;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits= new LinkedHashSet<>();
        fruits.add("Orange");
        fruits.add("Mandarin");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Apple");
        System.out.println(fruits);
    }
}
