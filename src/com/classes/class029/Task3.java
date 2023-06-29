package com.classes.class029;


import java.util.HashSet;
import java.util.Iterator;

/*Create a Set collection that will hold Objects of Student Type. In this set we do not care
about the insertion order. Each student object should have name and studentID. Display name of each student.
 */
public class Task3 {
    public static void main(String[] args) {
        HashSet<Student>students= new HashSet<>();
        students.add(new Student("Ali Deli",1452));
        students.add(new Student("Osi Mosi",1530));
        students.add(new Student("Guro Garo",2250));
        Iterator<Student>iterator=students.iterator();
        while (iterator.hasNext()){
            Student i= iterator.next();
            i.printStudentInfo();
        }

    }

}
class Student{
    String studentName;
    int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    void printStudentInfo(){
        System.out.println("Information of student is "+studentName+" "+studentID);
    }
}