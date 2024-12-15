/*TASK 2 STUDENT GRADE CALCULATOR*/

import java.util.*;

public class marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects: ");
        int numSubjects = sc.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject " + i + "(out of 100): ");
            int marks = sc.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println("Please enter marks between 0 and 100.");
                System.out.println("Enter marks for subject " + i + "out of 100): ");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("Student Result: ");
        System.out.println("Total marks obtained by a student in all subjects: " + totalMarks);

        float AveragePercentage = totalMarks / numSubjects;

        System.out.println("Average Percentage: " + AveragePercentage);

        if (AveragePercentage >= 95) {
            System.out.println("Your grade: A+");
        }

        else if (AveragePercentage >= 90) {
            System.out.println("Your grade: A");
        }

        else if (AveragePercentage >= 80) {
            System.out.println("Your grade: B+");
        }

        else if (AveragePercentage >= 75) {
            System.out.println("Your grade: B");
        }

        else if (AveragePercentage >= 50) {
            System.out.println("Your grade: C");
        }

        else if (AveragePercentage >= 35) {
            System.out.println("Your grade: D");
        }

        else {
            System.out.println("Your grade is: E");
        }

        sc.close();
    }
}