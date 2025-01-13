import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break = break out from a loop (STOP)
        // continue = skip current condition (SKIP)
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.println("Enter number of row: ");
        rows = scanner.nextInt();

        
        System.out.println("Enter number of column: ");
        columns = scanner.nextInt();

        
        System.out.println("Enter symbol: ");
        symbol = scanner.next().charAt(0);


        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }



        scanner.close();

    }
}

//  for(int i = 0; i < 10; i++){
//             if(i == 5){
//                 continue;
//             }

//             System.out.print(i + " ");
//         }
//     }