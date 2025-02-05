package com.inheritance;


    class UndergraduateStudent extends Student {
        String major;  // Specific to undergraduate students

        // Constructor to initialize undergraduate student properties
        UndergraduateStudent(String name, String studentId, double GPA, String major) {
            super(name, studentId, GPA);  // Calling the base class constructor
            this.major = major;
        }

        // Overriding the displayStudentInfo method
        @Override
        void displayStudentInfo() {
            super.displayStudentInfo();  // Calling the base class method
            System.out.println("Major: " + major);
        }
    }


