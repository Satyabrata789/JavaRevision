import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Step 1: Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number from 1 to 100
        int userGuess = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");

        // Step 2: Loop until the user guesses correctly
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            // Step 3: Provide feedback
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
        
        // Step 4: Close the scanner
        scanner.close();
    }
}
