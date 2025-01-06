public class stringMethods {
    public static void main(String[] args) {
        String name = "password";
        

        if(name.equalsIgnoreCase("Password")) {
            System.out.println("name can't be password");
        } else {
            System.out.printf("Hello %s \n", name);
        }
/* 


        // int length = name.length();
        // char letter  = name.charAt((0));
        // int index = name.indexOf(" ");
        // int lastIndex = name.lastIndexOf("e");


        // name = name.toUpperCase();
        // name = name.toUpperCase();
        // name=name.trim();

        name=name.replace("d", "f");

        if(name.isEmpty()){
            name = "Adebayo";
        }

        System.out.println(name);
        // System.out.println(lastIndex);
        // System.out.println(index);
        // System.out.println(length);
        // System.out.println(letter);
        */

        if(name.contains(" ")){
            System.out.printf("There is a space between your name %s",name);
        }
        else {
            System.out.printf("no gaps between your name  %s", name);
        }
    }
}
