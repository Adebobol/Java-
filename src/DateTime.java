import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.plaf.basic.BasicListUI.ListSelectionHandler;

public class DateTime {
    public static void main(String[] args) {

        // get present date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // get present time 
         LocalTime time = LocalTime.now();
         System.out.println(time);

        //  custom formatter for date and time
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy-HH-mm");

        String newDateTime = datetime.format(formatter);

        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2025,1,28,20,53);

         LocalDateTime date2 = LocalDateTime.of(2003,12,25,13,0,0);

         System.out.println(date1);
         System.out.println(date2);

         if(date1.isBefore(datetime)){
            System.out.println(date1 + " is before " + date2);
         } else if(date1.isAfter(datetime)){
            System.out.println(date1 + " is after " + date2);
         } else if(date1.isEqual(datetime)){
            System.err.println("Equal dates");
         }
    }
}
