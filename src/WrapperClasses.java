public class WrapperClasses {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitives values (int,char,double,boolean) to be used as objects. "Wrap them in an object"
        // Generally,don't wrap primitives unless you need an object. Allows use of collections Frameworks and static Utility Methods.

        // Autoboxing
        // Integer a = 123;
        // Double b = 3.142;
        // Character c = '$';
        // Boolean d = true;
        // String e = "Pizza";

        // Unboxing
        // int x = a;
        // double y = b;
        // char z = c;

        String a = Integer.toString(123);
        String b = Double.toString(3);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;
        System.out.println(x);
    }
}
