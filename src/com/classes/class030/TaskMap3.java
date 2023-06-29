package com.classes.class030;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*Create a map of Best Buy store. Placeitem id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
● Retrieve all keys and values from a Best Buy map using EntrySet.
*/
public class TaskMap3 {
    public static void main(String[] args) {
        HashMap<Integer, String> items = new HashMap<>();
        items.put(1324885, "Computer");
        items.put(6547189, "Printers");
        items.put(1424547, "Speakers");
        items.put(1324885, "Phones");
        //System.out.println(items);
        Iterator<Map.Entry<Integer, String>> iterator = items.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


       /* for (Map.Entry<Integer, String> i : items.entrySet()
        ) {
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

        */
    }
}
