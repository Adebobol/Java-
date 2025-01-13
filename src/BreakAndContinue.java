public class BreakAndContinue {
    public static void main(String[] args) {
        // break = break out from a loop (STOP)
        // continue = skip current condition (SKIP)
    

        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
