import java.util.Scanner;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // WEIGHT CONVERTER PROGRAM

        Scanner scanner = new Scanner(System.in);

        // DECLARE VARIABLES

        double weight;
        double newWeight;
        int choice;

        // WELCOME MESSAGE

        System.out.println("Weight conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // PROMPT FOR INPUT
        System.out.print("choose a conversion option: ");
        choice = scanner.nextInt();


        // OPTION 1 CONVERT LBS TO KGS
        if(choice == 1){
            System.out.println("Converting lbs to kgs...");
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight= weight*0.453592;
            System.out.printf("The new weight in kgs is %.2fkgs.\n", newWeight);
        }

        // OPTION 2 CONVERT KGS TO LBS

        else if(choice == 2){
            System.out.println("Converting kgs to lbs...");
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight= weight*2.20462;
            System.out.printf("The new weight in lbs is %.2flbs.\n", newWeight);
        }
        // ELSE PRINT NOT A VALID CHOICE
        else {
            System.out.println("Not a valid choice option.");
        }

        scanner.close();
    }
}
 