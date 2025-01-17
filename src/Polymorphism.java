abstract class Vehicle{

    abstract void go();

} 

class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("You drive the car.");
    }
}

class Bike extends Vehicle{

    @Override
    void go(){
        System.out.println("You ride the bike.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        // Polymorphism = 
        // interfaces can also be used for polymorphism 

        Car car = new Car();
        Bike bike = new Bike();

        Vehicle[] vehicles = {car,bike};

        for(Vehicle vehicle: vehicles){
            vehicle.go();
        }


    }
}
