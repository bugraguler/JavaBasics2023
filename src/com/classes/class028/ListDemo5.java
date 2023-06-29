package com.classes.class028;

import java.util.LinkedList;

public class ListDemo5 {
    public static void main(String[] args) {
        Student Bugra= new Student("Bugra",33,"reading");
        LinkedList<Student>list=new LinkedList<>();
        list.add(new Student("ali",25,"love"));
        list.add(new Student("osi",36,"hdk"));
        list.add(new Student("buri",55,"dde"));
        System.out.println(list);



    }
}
class Student{
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }

    String name;
    int age;
    String hobbies;

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
}