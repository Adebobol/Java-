import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts=0;
        int randomNumber = random.nextInt(11-1) + 1;


        System.out.println("Number Guessing Game.");
        System.out.println("Guess a number between 1-10.");



        while(guess != randomNumber){
            System.out.print("Enter your guess: ");
            guess= scanner.nextInt();
            
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW!! GUESS AGAIN");
            }
             else if(guess > randomNumber){
                System.out.println("TOO HIGH!! GUESS AGAIN");
             } else {
                System.out.println("CORRECT!! The random number was " + randomNumber);
             }
        }

        System.out.printf("Your guess %d match random number %n ",guess,randomNumber);

        scanner.close();
    }
}
