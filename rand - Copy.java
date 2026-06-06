import java.util.Random;
import java.util.Scanner;

public class rand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int roundsWon = 0;
        String playAgain;

        do {
            int number = random.nextInt(100) + 1; // 1 to 100
            int attempts = 5; // maximum attempts
            boolean guessed = false;

            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    guessed = true;
                    roundsWon++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("Game Over! The number was: " + number);
            }

            System.out.println("Rounds Won: " + roundsWon);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}