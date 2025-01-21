import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the amount of food yoiu would like: ");
        int numberOfFood = scanner.nextInt();

        scanner.nextLine();

        for (int a = 1; a <= numberOfFood; a++ ){
            System.out.print("Enter a food: ");
            
            String food = scanner.nextLine();

            foods.add(food);
        }
        System.out.print(foods);


        scanner.close();
    }
}

   // ArrayList = A resizeavle array that stores objects (autoboxing)
        // Arrays are fixed in size, but ArrayLists can change.

        // ArrayList<String> food = new ArrayList<>();

        // add()
        // food.add("Amala");
        // food.add("Semo");
        // food.add("Rice");
        // food.add("Bread");

        // remove()
        // food.remove(0);

        // set
        // food.set(1,"Kilishi");

        // get
    
        // System.out.println(food.get(2));

        // To sort arraylist we use the collections framework

        // Collections.sort(food);
        // System.out.println();

        // for(String dish: food){
        //     System.out.println(dish);
        // }

        // System.out.println(food.size());
        // System.out.println(food);
