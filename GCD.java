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
        // Two numbers: 10 and 20
        int num1 = 10;
        int num2 = 20;

        // Call the findGCD method and display the result
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}


