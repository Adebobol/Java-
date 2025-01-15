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


public class Object {
    public static void main(String[] args) {
        User user1 = new User("bobola19_", "adepoju@email.com");
        User user2 = new User("Anifowose");

        System.out.println(user1.email);
        System.out.println(user2.email);

    }
}
