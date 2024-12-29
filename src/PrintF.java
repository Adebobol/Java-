public class PrintF {
    public static void main(String[] args) {
        
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-chracter]

        String name = "Adepoju";
        char firstLetter = 'A';
        int age = 30;
        double height = 60.4;
        boolean isEmployed = true;

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative numbers are enclosed in
        // space = display a minus if negative, space if positive
        double price1 = 9.99;
        double price2 = 11.567;
        double price3 = -56.789;
        

        // padding
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        int id1= 1;
        int id2=24;
        int id3 = 567;
        int id4=45450;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("% .1f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .3f\n", price3);

        System.out.printf("My name is %s\n", name);
        System.out.printf("My name begins with letter %c\n", firstLetter);
        // d for integer
        System.out.printf("You are %d years old\n", age);
        // f for double
        System.out.printf("My height is %f\n", height);
        // b for boolean
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("My friend %s is %d years old", name,age);
    }
}
