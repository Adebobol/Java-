import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        double circumference;
        double area;
        double volume;
        double radius;


        Scanner scanner = new Scanner(System.in);

        // radius
        System.out.print("Enter a radius: ");
        radius = scanner.nextDouble();
        
        // circumference
        circumference = 2 * Math.PI * radius;
        // area
        area = Math.PI * Math.pow(radius,2);
        // volume
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference + "cm");
        System.out.println("The area of the circle with radius " + radius + " is: " + area + "cm^2");
        System.out.println("The volume of the circle with radius " + radius + " is: " + volume + "cm^3");

        scanner.close();
    }
}

       // double a;
        // double b;
        // double c;
        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // double result;

        // result = Math.pow(2, 3);
        // result= Math.abs(-3);
        // result = Math.sqrt(9);
        // result=Math.round(3.98);
        // result = Math.ceil(5.789);
        // Math.floor(4.90);
        // Math.max(2,78);
        // Math.min(0, 0);
        // System.out.println(result);

        // System.out.print("Enter your value for side A: ");
        // a = scanner.nextDouble();

        // System.out.print("Enter your value for side B: ");
        // b = scanner.nextDouble();

        // System.out.println(a);
        // System.out.println(b);

        // a = Math.pow(a, 2);
        
        // b = Math.pow(b, 2);
        


        // c = Math.sqrt(a + b);

        // System.err.println("Value of side c(Hypotenuse): " + c + "Cm");
