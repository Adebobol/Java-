public class VariableScope {

    // class variable
    int x = 4;

    public static void main(String[] args) {
        // local scope 
        int x = 1;

        System.out.println(x);

        doSomething();

    }

    static void doSomething(){
        int x = 4;

        System.out.println(x);
    }
}
