import java.util.Scanner;

public class GuessingGameWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set a secret number
        int secretNumber = 42;

        // Initialize a variable to track the number of attempts
        int attempts = 0;

        // Use a while loop to keep guessing until the correct answer is found
        while (true) {
            System.out.print("Guess a number: ");
            int guess = scanner.nextInt();

            attempts++;

            if (guess == secretNumber) {
                System.out.println(" Congratulations! You guessed it in " + attempts + " attempts!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
