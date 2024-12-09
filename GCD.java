import java.util.Scanner;

public class GCD {
    // Method to calculate the GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        // If b is 0, the GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive call
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the findGCD method and display the result
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Close the scanner
        scanner.close();
    }
}

