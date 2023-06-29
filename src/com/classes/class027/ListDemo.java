package com.classes.class027;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manuel Testing");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        courses.add("TestNg");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");
        courses.add("Dead");
        courses.add("Dead");
        System.out.println(courses);
        courses.set(courses.indexOf("Dead"),"NotYet");
        System.out.println(courses);
        List<String> deleteList= new ArrayList<>();
        deleteList.add("Java");
        deleteList.add("Dead");
        deleteList.add("API");
        courses.removeAll(deleteList);
        System.out.println(courses);


    }
}

