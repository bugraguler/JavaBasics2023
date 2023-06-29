package com.classes.class028;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String >tasklist= new ArrayList<>();
        tasklist.add("Java");
        tasklist.add("Deneme");
        tasklist.add("Denem");
        tasklist.add("abc");
        tasklist.add("jiloe");

        System.out.println(tasklist);

        Iterator<String>iterator= tasklist.iterator();
        while (iterator.hasNext()){
            if(iterator.next().toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(tasklist);
    }

}
