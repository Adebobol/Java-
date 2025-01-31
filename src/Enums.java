import java.util.Scanner;

enum Day {
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber=dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

}


public class Enums {
    public static void main(String[] args){
        // Enums = A special kind of class that represents a fixed set of constants. They improve code readability and are easy to maintain. More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

       

       try {
         Day day = Day.valueOf(response);
         switch(day){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY-> System.err.println("This is a weekday.");
            
            case SATURDAY,SUNDAY->System.out.println("This is weekend.");
        }
       } catch (IllegalArgumentException e) {
        // TODO: handle exception
        System.out.println("Please, enter a valid day " + e.getMessage());
       }


        scanner.close();
    }
}
