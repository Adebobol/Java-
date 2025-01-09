import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "";


        while(username.isEmpty()){
            System.out.print("Enter a username: ");
            username = scanner.next();
        }

        System.out.println(username.length());
        System.out.printf("Your username is %s.", username);
        scanner.close();
    }   
}
