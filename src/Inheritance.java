class Animal {

    boolean isAlive;
    String colour;
    String type;

    Animal(String colour, String type){
        this.colour= colour;
        this.isAlive=true;
    }

    void sound(){
        System.out.println("Speaking...");
    }
}

class Cat extends Animal{


    Cat(String colour,String type) {
        super(colour, type);
    }

    // void sound(){
    //     System.out.println("meowww...");
    // }
    
}


public class Inheritance {
    public static void main(String[] args) {
        
        Cat cat = new Cat("gold","wild");

        System.out.println(cat.colour);

        cat.sound();
    }
}
