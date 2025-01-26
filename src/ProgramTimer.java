import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ProgramTimer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds to countdown: ");
       int response = scanner.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

             int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count --;
                if(count <0) {
                    System.out.println("Ramadan Kareem");
                    timer.cancel();
                }
            }
            
        };
        timer.schedule(task,0,1000);

        scanner.close();
    }
}
