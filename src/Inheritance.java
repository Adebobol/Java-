class Animal {

    boolean isAlive;


    Animal(){
        this.isAlive=true;
    }

    void sound(){
        System.out.println("Speaking...");
    }
}

class Cat extends Animal{

}


public class Inheritance {
    public static void main(String[] args) {
        
        Cat cat = new Cat();

        cat.sound();
    }
}
