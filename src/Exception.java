import java.util.InputMismatchException;
import java.util.Scanner;


public class Exception {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program;
        // Dividing with Zero, file not found, mismatch input type
        // Surround any dangerous code with a try{} block,
        // try,catch,finally

        Scanner scanner = new Scanner(System.in);
         
        try{ 
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("That isn't a number.");
        } catch (ArithmeticException e){
            System.out.println("You can't divide by 0.");
        // } 
        } finally{
            scanner.close();
        }

        // scanner.close();
    }
}
