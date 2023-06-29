package com.classes.class024;

public class Student {
    void study(){
        System.out.println("Student must study");
    }
    void doHomework(){
        System.out.println("Student must do homeworks");
    }
    void practice(){
        System.out.println("Student must practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Student must study 25 hours");
    }
    void doHomework(){
        System.out.println("Student must do repls");
    }
    void practice(){
        System.out.println("Student must practice every moment");
    }
}
class CollegeStudents extends Student{

    void doHomework(){
        System.out.println("Student must do homeworks by help from another");
    }
}
class SchoolStudent extends Student{

}