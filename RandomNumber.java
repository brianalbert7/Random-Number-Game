package randomnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian Albert
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Variables
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(99); //n is a random number 0-99
        n += 1; //n is now a random number 1-100
        int guess;
        int numGuesses = 0;

        //Ask user for guess
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.print("\nWhat is your guess? ");
        guess = input.nextInt();

        //Give user hint
        while (guess != n) {
            if (guess > n) {
                numGuesses++;
                System.out.println("\noooh sorry - too high.  Guess again!");
                System.out.print("\nWhat is your guess? ");
                guess = input.nextInt();
            } else if (guess < n) {
                numGuesses++;
                System.out.println("\noooh sorry - too low.  Guess again!");
                System.out.print("\nWhat is your guess? ");
                guess = input.nextInt();
            }
        }
        
        //If the user gets the number correct
        if (guess == n) {
            numGuesses++;
            System.out.println("\nYou got it! And it only took you "
                    + numGuesses + " guesses!");
        }
    }
}
