import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // DECLARE VARIABLES


        double balance=0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU

        // GET AND PROCESS USERS CHOICE

        while(isRunning){
        System.out.println("*******************");
        System.out.println("BANK PROGRAM");
        System.out.println("1) Show Balance");
        System.out.println("2) Deposit");
        System.out.println("3) Withdraw");
        System.out.println("4) Exit");
        System.out.println("*******************");

        
        System.out.print("Select Choice: ");
        choice = scanner.nextInt();

         switch(choice){
            case 1:
                System.out.println("Show balance");
                showBalance(balance);
                break;
            case 2:
                System.out.println("Deposit");
                balance += deposit();
                showBalance(balance);
                break;
            case 3:
                System.out.println("Withdraw");
                balance -= withdraw(balance);
                showBalance(balance);
                break;
            case 4:
                System.out.println("Exit");
                isRunning= false;
                break;
            default:
                System.out.println("System error");

        }

        }
        System.out.println("Thank you for banking with us.");

        scanner.close();
    }

    static void showBalance(double balance){
            System.out.println("*******************");

            System.out.printf("$%.2f \n",balance);
           

        }

    static double deposit(){

        double amount;


        System.out.println("Enter amount: ");
        amount = scanner.nextDouble();

        if(amount <= 0 ){
            System.out.printf("You can't deposit $ %.2f",amount);
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;

        System.out.println("Enter amount: ");
        amount = scanner.nextDouble();

       if(amount > balance){
            System.out.println("INSUFFIECIENT FUNDS");
            return 0;
       } else if(amount < 0) {
            System.out.println("You can't withdraw.");
            return 0;
       } else{
                return amount;
       }
    }

}
