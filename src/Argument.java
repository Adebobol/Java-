import java.util.Arrays;

public class Argument {
    public static void main(String[] args) {

        char[][] phonedigits = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};

        for(char[] digits: phonedigits) {
          for(char digit: digits) {
            System.out.print(digit + " ");
          }
          System.out.println();
        } 
     
    }

    static int add(int... numbers){
      
        int sum = 0;

        for(int num: numbers){
            sum += num;

        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0) {
            return 0;
        }

        for(double num: numbers){
            sum += num;
        }
        return sum /numbers.length;
    }



}

   // // varargs = allow mwthod to accept a varying number of (()arguments)

        // // it makes methods more flexible, no need for an overloaded method

        // // java will pack the arguments into an array  ...(ellipsis)
        // // System.out.println(add(1,3,4,5,6,7,88,5,4,47));
        // System.out.println(average());
