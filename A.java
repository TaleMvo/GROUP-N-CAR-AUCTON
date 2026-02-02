// This allows us to get input from the user
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Counter to count 5 students
        int student = 1;

        // Variables to count how many students get each grade
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;
        int g6 = 0;
        int g7 = 0;
        int g8 = 0;
        int g9 = 0;

        // Loop runs for 5 students
        while (student <= 5) {

            // Ask user to enter score
            System.out.print("Enter score for student " + student + ": ");
            int score = input.nextInt();

            // Variables to store grade and remark
            int grade = 0;
            String remark = "";

            // Decide grade and remark using if-else
            if (score >= 80) {
                grade = 1;
                remark = "D1";
                g1++;
            } else if (score >= 75) {
                grade = 2;
                remark = "D2";
                g2++;
            } else if (score >= 66) {
                grade = 3;
                remark = "C3";
                g3++;
            } else if (score >= 60) {
                grade = 4;
                remark = "C4";
                g4++;
            } else if (score >= 50) {
                grade = 5;
                remark = "C5";
                g5++;
            } else if (score >= 45) {
                grade = 6;
                remark = "C6";
                g6++;
            } else if (score >= 35) {
                grade = 7;
                remark = "P7";
                g7++;
            } else if (score >= 30) {
                grade = 8;
                remark = "P8";
                g8++;
            } else {
                grade = 9;
                remark = "F";
                g9++;
            }

            // Display results for this student
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
            System.out.println(); // Blank line

            // Move to the next student
            student++;
        }

        // Display summary after all students are entered
        System.out.println("SUMMARY OF RESULTS");
        System.out.println("Grade 1 (D1): " + g1);
        System.out.println("Grade 2 (D2): " + g2);
        System.out.println("Grade 3 (C3): " + g3);
        System.out.println("Grade 4 (C4): " + g4);
        System.out.println("Grade 5 (C5): " + g5);
        System.out.println("Grade 6 (C6): " + g6);
        System.out.println("Grade 7 (P7): " + g7);
        System.out.println("Grade 8 (P8): " + g8);
        System.out.println("Grade 9 (F): " + g9);
    }
}
