package com.classes.class024;

public class StudentTester {
    public static void main(String[] args) {
        Student syntaxStudent = new SyntaxStudent();
        Student collegeStudent= new CollegeStudents();
        Student [] students={new SyntaxStudent(),new CollegeStudents(),new SchoolStudent()};
        for (Student student:students) {
            student.study();
            student.doHomework();
            student.practice();
        }
    }
}
