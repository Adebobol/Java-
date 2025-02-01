import java.util.Scanner;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        
        for(int i=1;i<=5 ;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
             
                System.out.println("Thread was interrupted.");
            }
            
            if(i==5){
                System.out.println("Time's up!");
            }
        }

    }
}


public class Threading {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously.
        // Helps improve performance with time-consuming operations
        // (File I/O, network communications, or any background tasks)


        // How to create a thread
        // Option 1. Extend the Thread class (simpler)
        // option 2. Implements the runnable interface (better)

        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}
