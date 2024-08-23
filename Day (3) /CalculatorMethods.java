public class CalculatorMethods {
    public static void main(String[] args) {
        // Call methods to perform calculations
        int sum = add(5, 3);
        int difference = subtract(10, 4);
        int product = multiply(2, 6);
        double quotient = divide(12, 3);

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
