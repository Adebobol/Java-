class Job {
    String type;

    Job(String type){
        this.type = type;
    }

   
    void description(){
        System.out.println("My job is being a " + type);
    }
}

class Engineer extends Job{
    Engineer(String type){
        super(type);
    }

    @Override
    void description(){
        System.out.printf("I am a %s engineer.",type);
    }

    
}


public class MethodOverride {
    public static void main(String[] args) {
        
        Engineer engineer = new Engineer("chemical");

        engineer.description();
    }
}
