public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switches = Replacement for else - if

        String day = "friday";

        switch(day){
            case "Monday" :
          
            
            case "Tuesday":
           
            case "Wednesday" :
         
            case "Thursday" :
           
            case "friday" :
            System.out.println("It is a weekday.");
            break;
            case "Saturday" :
            
            case "Sunday" :
            System.out.println("It is a weekend.");
            break;
            default:
            System.out.println("Not a day");
        }

       
    }
}

 // if(day.equals("Monday")) {
        //     System.out.println("It is a weekday.");
        // } else if(day.equals("Tuesday")){
        //     System.out.println("It is a weekday.");
        // } else if(day.equals("Wednesday")){
        //     System.out.println("It is a weekday.");
        // } else if(day.equals("Thursday")){
        //     System.out.println("It is a weekday.");
        // } else if(day.equals("Friday")){
        //     System.out.println("It is a weekday.");
        // } else if(day.equals("Saturday")){
        //     System.out.println("It is a weekend.");
        // } else if(day.equals("Sunday")){
        //     System.out.println("It is a weekend.");
        // } else {
        //     System.out.println("It is not a weekday neither a weekend.");
        // }