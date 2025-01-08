import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator= true;
        

        System.out.print("Enter number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator(+,-,x,%): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+':
            result= num1 + num2;
            break;

            case '-':
            result= num1 - num2;
            break;

            case 'x':
            result= num1 * num2;
            break;

            case '%':
            if(num2 ==0){
                System.out.println("Cannot divide by 0");
                validOperator= false;
            } else {  
                result= num1 / num2;
            }
            break;

            default:
                System.out.println("Invalid operator");
                validOperator = false;


        }

        if(validOperator) {
            System.out.println(result);
        }

        scanner.close();
    }
}
