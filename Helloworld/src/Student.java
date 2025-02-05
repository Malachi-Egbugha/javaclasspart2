public class Student {
    String name;
    String studentId;
    double GPA;
    // Constructor to initialize student properties
    Student(String name, String studentId, double GPA) {
        this.name = name;
        this.studentId = studentId;
        this.GPA = GPA;
    }
    // Method to display basic student information
    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + GPA);
    }


}
