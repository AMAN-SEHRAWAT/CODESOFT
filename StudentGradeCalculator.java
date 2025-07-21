// StudentGradeCalculator
import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Input validation
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print(" Invalid input. Enter marks between 0 and 100: ");
                marks[i] = sc.nextInt();
            }

            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("\n RESULT");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

