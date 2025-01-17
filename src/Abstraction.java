abstract class Shape {

    String name;

    abstract  double area(); 

    void display(){
        System.out.println("This a " + name +  " shape.");
    }

    Shape(String name){
        this.name=name;

    }
}

class Circle extends Shape {

    double radius;

    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
   
        return Math.PI * Math.pow(radius, 2);
    }

}

class Square extends Shape{

    double height;
    double base;

    Square(String name, double height, double base){
        super(name);
        this.base=base;
        this.height= height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

}


public class Abstraction {
    public static void main(String[] args) {
        // abstarct = Used to define abstract classes amd methods.
        // Abstarction is the process of hiding implementation details and showing only the essential features;
        // Abstraction classes can't be instantiated directly
        // Can contain 'abstarct methods (which must be implemented)'
        // Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle("circle",2.2);
        Square square = new Square("Square",3,5);

        circle.display();
        System.out.println(circle.area());
        System.out.println();
        square.display();
    System.out.println(    square.area());

    }
}
