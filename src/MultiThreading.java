class MyRun implements Runnable{

    private final String text;

    MyRun(String text){
        this.text = text;
    }


    @Override
    public void run(){
        for(int i = 1;i<=5;i++) {
            try {
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().getName() + " " + i);
                System.out.println(text);

                // I did this first
                // if(Thread.currentThread().getName().equals("Thread-1")){
                //     System.out.println("PING!!");
                // } else if(Thread.currentThread().getName().equals("Thread-0")){
                //     System.out.println("PONG!!");
                // }
            } catch (InterruptedException e) {
            
                System.out.println("Thread interrupted.");
            }
        }
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        // MultiThreading = Enables a program to run multiple threads concurrently (Thread = A set of instructions that run independently) useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new MyRun("PING!!"));
        Thread thread2 = new Thread(new MyRun("PONG!!"));

        System.out.println("game");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Main thread interrupted. " + e.getMessage());
        }

        System.out.println("game over");
    }
}
