package com.inheritance;

public class Child extends  Parent {
    public void Myname(){
        System.out.println("Parent class");
    }

@Override
    public void Test(){
        System.out.println("From Child");

}

}
/*
Classwork2: Student Management System Using Inheritance
Problem Statement:
You are tasked with designing a simple Student Management System. The system will manage different types of students, such as Undergraduate and Graduate students.

Create a base class Student:

It should have the following properties:
name (String): Name of the student.
studentId (String): Unique identifier for each student.
GPA (double): Grade Point Average of the student.
It should have methods to:
displayStudentInfo(): Display basic information about the student.
Create derived classes UndergraduateStudent and GraduateStudent:
UndergraduateStudent: Inherits from Student and adds additional properties or methods specific to undergraduate students.
GraduateStudent: Inherits from Student and adds properties or methods specific to graduate students.
User Input: Use the Scanner class to gather student details from the user, including their type (Undergraduate/Graduate). Based on the type, create instances of either UndergraduateStudent or GraduateStudent and display their details.
 */
