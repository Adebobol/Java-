interface Prey {

    void run();
}

interface Predator {

    void hunt();
}


class Fish implements Prey, Predator {

    String name;

    Fish(String name){
        this.name  = name;

    }


    @Override
    public void  hunt(){
        System.out.println("Hunting down smaller " + this.name);

    }


    @Override
    public void run(){
        System.out.println(this.name + " Running...");
    }
}

class Hawk implements Predator{

    String name;

    Hawk(String name){
        this.name = name;

    }

    @Override
    public void hunt(){
        System.out.println(this.name + " tearing flesh.");
    }

}



public class Interface {
    public static void main(String[] args) {
        // Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
        // Supports multiple inheritance like behaviour
    
    
        Fish fish = new Fish("fish");
        Hawk hawk = new Hawk("hawk");

        fish.run();
        fish.hunt();
        hawk.hunt();
    }
}
