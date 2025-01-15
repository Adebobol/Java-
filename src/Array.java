import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] foods = new String[3];
        foods[1]="Amala";


        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food: foods){
            System.out.println(food);
        }

       
        scanner.close();
        
    }
}

//  String [] fruits = {"apple","cherry","melon"};


//         int noOfFruits = fruits.length;
//         // array methods
//         Arrays.sort(fruits);
//         Arrays.fill(fruits, "orange");
//         // Enhanced for loop
//         for(String fruit : fruits) {
//             System.out.println(fruit); 
//         }