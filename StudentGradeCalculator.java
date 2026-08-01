import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("========================================");
        // Enter Student Name
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        // Enter Number of Subjects
        System.out.print("Enter Number of Subjects: ");
        int subjects = input.nextInt();
        int totalMarks = 0;
        // Input marks for each subject
        for (int i = 1; i <= subjects; i++) {
            int marks;
            while (true) {
                System.out.print("Enter Marks for Subject " + i + " (0-100): ");
                marks = input.nextInt();
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid Marks! Please enter between 0 and 100.");
                }
            }
            totalMarks += marks;
        }
        // Calculate Percentage
        double percentage = (double) totalMarks / subjects;
        // Grade Calculation
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        // Pass/Fail
        String result;

        if (percentage >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";
        }
        // Display Result
        System.out.println("\n========================================");
        System.out.println("            RESULT CARD");
        System.out.println("========================================");
        System.out.println("Student Name : " + name);
        System.out.println("Subjects     : " + subjects);
        System.out.println("Total Marks  : " + totalMarks + " / " + (subjects * 100));
        System.out.printf("Percentage   : %.2f%%\n", percentage);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("========================================");
        input.close();
    }
}
