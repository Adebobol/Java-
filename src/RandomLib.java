import java.util.Random;

public class RandomLib {
    public static void main(String[] args) {
        
        Random random = new Random();

        boolean isHead;

        isHead = random.nextBoolean();


        if (isHead) {
            System.out.println("Is a head");     
        }
        else{
            System.out.println("Is a tail");
        }
    }
    
}
