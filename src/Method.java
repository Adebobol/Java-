public class Method {

    public static void greetings(String name,int age) {
        // System.out.println("Ramadan Kareem " + name);
        // System.out.printf("As you clock %d, may the almight Allah continue to increase you in knowledge and power.",age);
    //    double result =  cube(3);
    //     System.out.println(result);

        int number = 19;
        if(verify(number)){
            System.out.println("You can proceed to register.");
        } else {
            System.out.println("Hey, you can't register at the minute. Try again in the future.");
        }
    }
    public static void main(String[] args) {

        // method a block of code that is reusable

            greetings("Anifowose",22);
    }

    static double square(double number){
        return Math.pow(number,2);
    }

    static double cube(double number){
        return Math.pow(number, 3);
    }

    static boolean verify(int age){
        if(age > 18) {
            return true;
        } else {
            return false;
        }
               
    }

}
