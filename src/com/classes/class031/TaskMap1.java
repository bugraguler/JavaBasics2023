package com.classes.class031;

import java.util.HashMap;
import java.util.Map;
/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who
gets the highest salary. Output should be in the below format John Smith=$100000
 */
public class TaskMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>employee= new HashMap<>();
        employee.put("John Smith",100000);
        employee.put("Ali Can",25000);
        employee.put("Asghar",74000);
        employee.put("Salih",99000);

        String name=null;
        Integer salary=0;

        for(Map.Entry<String,Integer>entry: employee.entrySet()){
            if(entry.getValue()>salary){
                salary= entry.getValue();
                name=entry.getKey();
            }
        }
        System.out.println(name+" =$"+salary);

    }
}

