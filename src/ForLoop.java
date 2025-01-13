public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        
        // for loop
        int start = 10;
        for(int i = start; i > 0; i--) {
            
            System.out.println(i);

            Thread.sleep(1000);
        }

        System.out.println("Ramadan Kareem!!!");
       
    }
}


// a simple implementation of a for loop
// for(int i = 0; i<10;i++){
//     System.out.printf("(%d)Pizza\n",i);
// }