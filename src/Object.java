class Music {
    String name;
    String year;
    int duration;
    boolean listening;

    // overloaded constructors = Allow a class to have multiple constructors with different parameters list

    Music(String name,String year, int duration){
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.listening = true; 
    }

    void play(){
        System.out.println("Currently listening to " + this.name);
    }

}

class User {
    String username;
    String email;
    int age;

    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 18;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 18;
    }
}

class Friend {

    // static = makes a variable or method belong to the class rather than to any specific object.
    // Commonly used ofr utility methods or shared resources


    String name;
    static int totalFriends;

    Friend(String name){
        this.name = name;
        totalFriends++;
    }

    static String friend(){
        return "I have " + totalFriends + " friend.";
    }
}


public class Object {
    public static void main(String[] args) {
     
        Friend friend1= new Friend("Samuel");
        Friend friend2= new Friend("Emmanuel");
        Friend friend3= new Friend("Abdullah");



        System.out.println(friend1.name);
        System.out.println(Friend.friend());
    }
}


   // User user1 = new User("bobola19_", "adepoju@email.com");
        // User user2 = new User("Anifowose");

        // System.out.println(user1.email);
        // System.out.println(user2.email);
