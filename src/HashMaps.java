import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        
        // Hashmaptik = A data structure that stores key-value pairs Keys are unique, but values can be duplicated does not maintain any order, but is memory efficient Hashmaptik<Key, Value>

        HashMap<String, Double> maptik = new HashMap<>();

        // put
        maptik.put("apple",50.2);
        maptik.put("orange",3.45);

        // remove
        // maptik.remove("apple");

        
        // get
        maptik.get("apple");

        // contains key
        maptik.containsKey("apple");

        // contains value
        maptik.containsValue(50.2);

        System.out.println(maptik.containsValue(50.2));
        System.out.println(maptik.containsKey("apple"));
        System.out.println( maptik.get("apple"));
        System.out.println(maptik);

        System.out.println(maptik.size());

        if(maptik.containsKey("pie")){
            System.out.println(maptik.get("apple"));
        } else {
            System.out.println("Key not found.");
        }

        for(String key: maptik.keySet()){
            System.out.println(key + " : $" + maptik.get(key));
        }
    }
}
