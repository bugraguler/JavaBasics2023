package com.classes.syntaxoops2;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.Name="Ali";
        student1.ID=501;
        Students.numberOfStudents++;
        Students student2 = new Students();
        student2.Name="Veli";
        student2.ID=517;
        Students.numberOfStudents++;
        Students student3 = new Students();
        student3.Name="Deli";
        student3.ID=527;
        Students.numberOfStudents++;
        System.out.println( Students.numberOfStudents++);

    }
}
