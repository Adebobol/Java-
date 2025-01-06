import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String email;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        String username = email.substring(0,7);
        String domain = email.substring(email.indexOf("@") + 1);

        if(email.contains("@")) {
        System.out.println(domain);

        System.out.println(email);
        System.out.println(username);
        } else {
            System.out.println("Emails must contain @ sign.");
        }

        scanner.close();
    }
}
