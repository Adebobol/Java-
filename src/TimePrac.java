import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.text.DateFormatter;

public class TimePrac {
    public static void main(String[] args) {
        LocalDateTime md = LocalDateTime.of(2025,01,28,22, 9);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d, MMMM uuuu. HH:mm");
        String md1 = md.format(formatter);

        System.out.println(md1);

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                LocalDateTime date = LocalDateTime.now();
                 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d, MMMM uuuu. HH:mm");
                String date1 = date.format(formatter); 
                System.err.println(date1);
                System.err.println(md1); 
              
                // System.out.println("Waiting");
                if(date.withNano(0).equals(md.withNano(0))) {
                    System.out.println("Alarm rings!!!!");
                    timer.cancel();
                } 
            }

        };

        timer.schedule(task, 0,1000);

        // while(true){
        //     if(date.withNano(0).isEqual(md)) {
        //     System.out.println("Alarm rings!!!!");
        //     } else {
        //     System.out.println("Waiting");
        //     }
        // }

        

    
    }
}
