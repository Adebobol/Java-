import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        // receiving inputs
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        if(quantity > 1) {
            item = item + "'s";
        }
        
        total = price * quantity;

        // printing out cart result
        System.out.println("\nYou have bought "+ quantity + " " +  item + ".");
        System.out.println("Your total is $" + total+ ".");

        // closing scanner very important
        scanner.close();
    }
}
