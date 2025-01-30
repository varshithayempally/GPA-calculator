import java.util.Scanner;
public class GPAcalculator {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalGradePoints = 0;
        double totalCredits = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade points for subject " + i + " (e.g., 4.0 for A): ");
            double gradePoint = scanner.nextDouble();

            System.out.print("Enter credit hours for subject " + i + ": ");
            double creditHours = scanner.nextDouble();

            totalGradePoints += gradePoint * creditHours;
            totalCredits += creditHours;
        }

        double gpa = totalGradePoints / totalCredits;
        System.out.printf("Your GPA is: %.2f\n", gpa);

        scanner.close();
    }
}

    

