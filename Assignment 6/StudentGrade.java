import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = userInput.nextInt();
        char grade;

        if (marks >= 95) {
            grade = 'A';
        } else if (marks >= 85) {
            grade = 'B';
        } else if (marks >= 65) {
            grade = 'C';
        } else if (marks >= 45) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Grade is: " + grade);
        userInput.close();
    }
}
