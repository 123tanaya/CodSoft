package Task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;
        boolean playAgain = true;
        int totalScore = 0;
        int roundsWon = 0;
        int roundsPlayed = 0;

        System.out.println("Welcome to Random Number Guessing Game Between 1 - 100!");

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean roundWon = false;
            roundsPlayed++;

           
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    roundWon = true;
                    break;
                }
            }

            if (!roundWon) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + randomNumber + ".");
            }

            totalScore += maxAttempts - attempts + (roundWon ? 10 : 0);
            if (roundWon) {
                roundsWon++;
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game Over!");
        System.out.println("Total Rounds Played: " + roundsPlayed);
        System.out.println("Total Rounds Won: " + roundsWon);
        System.out.println("Your Total Score: " + totalScore);

        scanner.close();
    }
}

