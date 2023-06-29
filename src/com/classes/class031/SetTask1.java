package com.classes.class031;

/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
a. Write a logic to concatenate all string from the collection.
 */

import java.util.LinkedHashSet;

public class SetTask1 {
    public static void main(String[] args) {
        LinkedHashSet<String> obj = new LinkedHashSet<>();
        obj.add("Ali");
        obj.add("Veli");
        obj.add("Deli");
        obj.add("Koli");
        obj.add("Bali");
        StringBuilder str= new StringBuilder();
        for (String s:obj
             ) {
           str.append(s);
        }


       /*
        Iterator<String> iterator = obj.iterator();
        while (iterator.hasNext()) {
            str = str.concat(iterator.next());
        }

        */
        System.out.println(str);
    }
}

