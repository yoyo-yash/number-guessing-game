import java.util.Scanner; // importing scanner
import java.util.Random; // importing random

class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // set up new scanner object
        Random random = new Random(); // set up random object

        // declare variables
        int guess;
        int number;
        int attempts = 0;

        number = random.nextInt(1, 101); // generate a random number

        System.out.println("---------------------------------------");
        System.out.println("WELCOME! This is a number guessing game");
        System.out.println("---------------------------------------");
        System.out.println("Guess a number between 1-100");
        System.out.println("---------------------------------------");

        do{
            System.out.print("Guess the number: ");
            guess = scanner.nextInt(); // takes user input
            attempts++; // keeps a track of attempts

            if(guess < number){
                System.out.println("TOO LOW! Try again.");
            }
            else if(guess > number){
                System.out.println("TOO HIGH!, Try again.");
            }
            else{
                System.out.println("---------------------------------------");
                System.out.println("You guessed it correctly! The number was " + number);
                System.out.println("It took you " + attempts + " attempts"); // prints number of attempts
            }
        }while(guess != number);

        scanner.close(); // close scanner

    }
}