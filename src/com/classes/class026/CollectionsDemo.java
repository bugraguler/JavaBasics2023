package com.classes.class026;

import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*String[] names = new String[100];
        names [0]="ali";
        names [4]="veli";
        System.out.println(Arrays.toString(names));
         */
        ArrayList<String>syntaxStudents= new ArrayList<>();
        syntaxStudents.add("Ahmet");
        syntaxStudents.add("osman");
        syntaxStudents.add("ali");
        System.out.println(syntaxStudents);
        System.out.println(syntaxStudents.get(0));


    }
}
