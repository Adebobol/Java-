import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        // Java hangman

        String word = "Laziness";
        int wrongGuesses = 0;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordstate = new ArrayList<>();

        for(int i = 0; i<word.length();i++ ){
            
            wordstate.add('_');
          
        }

        System.out.println("***********************");
        System.out.println("Welcome To Java Hnagman");
        System.out.println("***********************");


        scanner.close();
    }
}
