import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set a secret number
        int secretNumber = 42;

        // Get user input
        System.out.print("Guess a number: ");
        int guess = scanner.nextInt();

        // Check if the guess is correct
        if (guess == secretNumber) {
            System.out.println(" Congratulations! You guessed it!");
        } else if (guess < secretNumber) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
    }
}
