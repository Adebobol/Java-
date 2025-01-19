class Engine {
    String engineType;

   Engine(String engineType){
        this.engineType=engineType;

    }

    void start(){
        System.out.printf("Starting the %s",engineType);

    }
}

class Truck {
    String model;
    int year;
    Engine engine;

    Truck(String model, int year, String engineType){
        this.model  = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void startCar(){
        System.out.println("Car has started.");
        engine.start();
    }
}

public class Composition {
    public static void main(String[] args) {
        // Composition = It represents a "part-of" relationship between objects.

        // Engine engine = new Engine(null)
        Truck car1 = new Truck("Benz", 2025,"v8");

        System.out.println(car1.model);
        System.err.println(car1.year);
        System.out.println(car1.engine.engineType);
        car1.startCar();
        
    }
}
