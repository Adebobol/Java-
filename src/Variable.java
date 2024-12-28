public class Variable {
    public static void main(String[] args) {
        // variable in java 
        // we have the primitive and the reference 
        // primitive stored in the memory stack, reference stored in the heap

        /*
         * creating a primitive data type 
         * decleration
         * assignmnet
         */
        // 1 int
        int age = 21;
        int year = 2025;
        int quantity = 1;
        // System.out.println(age);
        // System.out.println(year);
        // System.out.println(quantity);

        //2 double
        double price = 9.99;
        double gpa =3.8;

        // System.out.println(price);
        // 3 char
        
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        // 4 boolean

        boolean isStudent = true;
        boolean isValid = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        if(isOnline) {
            System.out.println("Send me our 407 material.");
        }

        // String 
        String name = "Adepoju";
        String food = "Amala";
        String Colour = "Blue";
        String email = "adepoju6@gmail.com";

        System.out.println("My email is " + email);
    }
}
