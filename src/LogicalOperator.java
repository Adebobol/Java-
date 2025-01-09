public class LogicalOperator {
    public static void main(String[] args) {
        
        // && = AND
        // || = OR
        // ! = NOT

        String name = "Adepoj";
        boolean isFirstborn = true;
        boolean ismale = false;

        // the and operator needs all conditions to be true
        // the not operator gives the opposite of the condition

        if(name == "Adepoju" && name.startsWith("Adp") && isFirstborn){
            System.out.println("You are truly Adepoju.");
        } else if(name == "Adepoju" && name.startsWith("A") && !ismale){
            System.out.println("That's my name.");
        } else if(name == "Adebobola" || !ismale){
            System.out.println("Still me.");
        }
    }
}
