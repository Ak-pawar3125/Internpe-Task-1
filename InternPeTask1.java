import java.util.Random;
import java.util.Scanner;

public class InternPeTask1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String playGame = "yes";
            int userGuess = -1;
            int triesCount = 0;

            while (playGame.equals("yes")) {
                Random random = new Random();
                int randNum = 0;
                triesCount = 0;
                int userChoice;

                System.out.println("Select difficulty");
                System.out.println("For Beginner type 1");
                System.out.println("For Intermediate type 2");
                System.out.println("For Expert type 3");

                do {
                    userChoice = sc.nextInt();
                    if (userChoice < 1 || userChoice > 3) {
                        System.out.println("Invalid choice! Choose number between 1 to 3:");
                    }
                } while (userChoice < 1 || userChoice > 3);

                switch (userChoice) {
                    case 1 -> {
                        randNum = random.nextInt(200) + 1;
                        System.out.println("Guess a number between 1 & 200:");
                    }
                    case 2 -> {
                        randNum = random.nextInt(300) + 1;
                        System.out.println("Guess a number between 1 & 300:");
                    }
                    case 3 -> {
                        randNum = random.nextInt(500) + 1;
                        System.out.println("Guess a number between 1 & 500:");
                    }
                }

                while (userGuess != randNum) {
                    userGuess = sc.nextInt();
                    triesCount++;

                    if (userGuess == randNum) {
                        System.out.println("Yahooo! You guessed the number successfully.");
                        System.out.println("It only took " + triesCount + " " + "guesses!");
                        System.out.println("Would you like to play again? Type Yes or No:");
                        playGame = sc.next().toLowerCase();
                    } else if (userGuess < randNum) {
                        System.out.println("Your guess is too low, try again :)");
                    } else {
                        System.out.println("Your guess is too high, try again :)");
                    }
                }
            }
        }
    }
}
