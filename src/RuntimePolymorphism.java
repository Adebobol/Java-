import java.util.Scanner;

interface Livestock {

    void speak();
}

class Do implements Livestock {

    @Override
    public void speak(){
        System.out.println("The dog woofs...");
    }

}

class Ca implements Livestock {

    @Override
    public void speak(){
        System.out.println("The cat goes meow.");
    }
}


public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism or dynamic polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object.

         Livestock livestock;

         Scanner scanner = new Scanner(System.in);

         System.out.println("What type of animal do you need? (1. cat, 2. dog):");
         int choice = scanner.nextInt();

         if(choice == 1){
            livestock = new Ca();
            livestock.speak();
         } else if(choice == 2){
            livestock = new Do();
            livestock.speak();
         }


         scanner.close();

    }
}
