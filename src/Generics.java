class Box<T>{

    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}

class Product<T,U>{

    T item;
    U price;

    Product(T item ,U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface or method that is compatible with different data types. <T,U> Type parameter (placeholder that gets replaced with a real type) <String> Type argument (specifies the type)

        // Box<String> box = new Box<>();
        
        // Box<Integer> box = new Box<>();

        // box.setItem(20);
        // box.setItem("bra");

        // System.out.println(box.getItem());

        Product<String,Double> product = new Product<>("belt",89.35);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());


    }
}
