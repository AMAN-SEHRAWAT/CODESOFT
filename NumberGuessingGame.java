import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int guess;
            boolean guessedCorrectly = false;

            System.out.println(" Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 and 100. You have 5 attempts.");

            while (attempts < 5) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println(" Correct! You guessed it in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("  low!");
                } else {
                    System.out.println("  high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println(" Sorry! The correct number was: " + numberToGuess);
            }

            System.out.println(" Current Score: " + score);
            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println(" Thanks for playing! Final score: " + score);
        sc.close();
    }
}

