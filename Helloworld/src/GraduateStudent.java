public class GraduateStudent extends  Student{
    String researchTopic;  // Specific to graduate students

    // Constructor to initialize graduate student properties
    GraduateStudent(String name, String studentId, double GPA, String researchTopic) {
        super(name, studentId, GPA);  // Calling the base class constructor
        this.researchTopic = researchTopic;
    }

    // Overriding the displayStudentInfo method
    @Override
    void displayStudentInfo() {
        super.displayStudentInfo();  // Calling the base class method
        System.out.println("Research Topic: " + researchTopic);
    }

}
