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
                int randNum = random.nextInt(100);
                triesCount = 0;
                
                while (userGuess != randNum) {
                    System.out.println("Guess a number in between 1 & 100:");
                    userGuess = sc.nextInt();
                    triesCount++;
                    
                    if (userGuess == randNum) {
                        System.out.println("Yahooo! You guessed the number successfully.");
                        System.out.println("It only took " + triesCount + " " + "guesses!");
                        System.out.println("Would you like to play game again? type Yes or No:");
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