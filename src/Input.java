import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    

        // calculating the area of a triangle
        double width = 0;
        double height = 0;
        double area =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Area is " + area + "cm^2");

        scanner.close();

    }
}
