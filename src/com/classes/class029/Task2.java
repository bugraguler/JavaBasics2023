package com.classes.class029;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Ankara");
        cities.add("Izmir");
        cities.add("Konya");
        cities.add("Maras");
        cities.add("Samsun");
        cities.add("Artvin");
        System.out.println(cities);
        Iterator<String>iterator= cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().startsWith("a")){
                iterator.remove();
            }
        }

        System.out.println(cities);
    }
}