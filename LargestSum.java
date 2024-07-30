import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the largest number
        double largest = Math.max(num1, Math.max(num2, num3));

        // Calculate the sum of the largest number
        double sum = largest;

        // Display the result
        System.out.println("The sum of the largest number (" + largest + ") is: " + sum);

        scanner.close();
    }
}

