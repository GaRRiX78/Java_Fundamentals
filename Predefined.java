import java.util.Scanner;

public class Predefined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator, denominator, result;
        try {
            System.out.print("Enter the numerator: ");
            numerator = input.nextInt();
            System.out.print("Enter the denominator: ");
            denominator = input.nextInt();
            result = numerator / denominator;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please enter a non-zero denominator.");
        } finally {
            System.out.println("Program completed.");
        }
    }
}
