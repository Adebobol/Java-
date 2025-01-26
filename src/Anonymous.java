class Dog {

    void speak(){
        System.out.println("The dog goes *woof*.");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // Anonymous classses = A class that doesn't have a name. Cannot be resused. 
        // Add custom behaviour without having to create a new class. Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak() {
                System.out.println("My dog says 'Hello...'");
            };
        };


        dog1.speak();
        dog2.speak();

    }
}
