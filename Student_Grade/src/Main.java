import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalGrade = 0.0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter The Number " + i + ": ");
            double grade = scanner.nextDouble();
            totalGrade += grade;
        }

        double averageGrade = totalGrade / 3;
        System.out.println("Average Of These Three: " + averageGrade);

        scanner.close();
    }
}
