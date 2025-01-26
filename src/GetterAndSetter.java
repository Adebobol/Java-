class Phone{
    private String model;
    private String Colour;
    private int Price;


    public String getModel() {
        return model;
    }

    public String getColour() {
        return Colour;
    }
    public String getPrice() {
         return "$" + Price;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {

        if(price < 0) {
            System.out.println("Price can't be less than zero");
        } else { 
            Price = price;
        }
    }



    Phone(String model,
    String Colour,
    int Price){
        this.Colour=Colour;
        this.model=model;
        this.Price=Price;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        
        // They help protect data and add rules for accessing or modifying objects.
        // GETTERS = Methods that makes a field READABLE
        // SETTERS = Methods that makes a field WRITABLE

        Phone phone = new Phone("Samsung", "blue", 250000);

        System.out.println(phone.getColour());
        
    }
}
