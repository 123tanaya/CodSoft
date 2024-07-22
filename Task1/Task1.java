package Task1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        
        System.out.println("Total Marks: " + totalMarks);

        
        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;
        System.out.println("Average Percentage: " + averagePercentage+"%");

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Final Grade: " + grade);

        
        String result = averagePercentage >= 40 ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        scanner.close();
    }
}

