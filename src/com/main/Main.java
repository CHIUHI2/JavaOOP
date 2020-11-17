package com.main;

import Student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Charlie", 23, "M", "TEST12345678");

        System.out.println("Student's name : " + student.getName());
        System.out.println("Student's age : " + student.getAge());
        System.out.println("Student's gender : " + student.getGender());
        System.out.println("Student's student ID : " + student.getId());
    }
}
