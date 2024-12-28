import java.util.Scanner;



public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean isStudent;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        // isStudent statements
        if(isStudent) {
            System.out.println("He is a student");
        }  else {
            System.out.println("He is not a student");
        }

        // age statements
        if (age >= 18){
            System.out.println("You are an Adult.");
        }else if(age < 0) {
            System.out.println("You are a kid  to be born");
        } else if(age ==0){
        System.out.println("You are a baby.");
        }
         else {
            System.out.println("You are still a teenager.");
        }



        // 
        scanner.close();
    }
}
