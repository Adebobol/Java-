import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter your temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to celsius or Farenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C"))?(temp-32)*5/9:(temp* 5/9)+32;

        System.out.printf("%.1f%s",newTemp,unit);

        scanner.close();
    }
}