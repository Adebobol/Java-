class Job {
    String type;
    String salary;

    Job(String type, String salary){
        this.type = type;
        this.salary= salary;
    }

   
    void description(){
        System.out.println("My job is being a " + type);
    }

    @Override
    public String toString(){
        return this.type + " Engineer, with a salary of  " + this.salary;  
    }
}

class Engineer extends Job{
    Engineer(String type ,String salary){
        super(type,salary);
    }

    @Override
    void description(){
        System.out.printf("I am a %s engineer.",type);
    }

    
}


public class MethodOverride {
    public static void main(String[] args) {
        
        Engineer engineer = new Engineer("Chemical", "20000");

        Engineer engineer2 = new Engineer("Systems", "300000");

        System.out.println(engineer.toString());
        System.out.println(engineer2.toString());
        engineer.description();
    }
}
