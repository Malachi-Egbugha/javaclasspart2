import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

         */

        Scanner scanner = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline
        // Create an array to store students
        Student[] students = new Student[numberOfStudents];
        // Loop to collect student data and create objects
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            // Get student type (Undergraduate or Graduate)
            System.out.print("Enter student type (Undergraduate/Graduate): ");
            String studentType = scanner.nextLine().trim();

            // Get common student details
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Enter GPA: ");
            double GPA = scanner.nextDouble();
            scanner.nextLine();  // Consume the leftover newline

            // Based on student type, create an appropriate student object
            if (studentType.equalsIgnoreCase("Undergraduate")) {
                System.out.print("Enter major: ");
                String major = scanner.nextLine();
                students[i] = new UndergraduateStudent(name, studentId, GPA, major);
            } else if (studentType.equalsIgnoreCase("Graduate")) {
                System.out.print("Enter research topic: ");
                String researchTopic = scanner.nextLine();
                students[i] = new GraduateStudent(name, studentId, GPA, researchTopic);
            } else {
                System.out.println("Invalid student type entered! Skipping...");
                i--;  // Decrement to retry this iteration
                continue;
            }


        }
    }
}