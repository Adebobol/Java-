import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        
        // HashMap = A data structure that stores key-value pairs Keys are unique, but values can be duplicated does not maintain any order, but is memory efficient HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        // put
        map.put("apple",50.2);
        map.put("orange",3.45);

        // remove
        // map.remove("apple");

        // get
        map.get("apple");

        // contains key
        map.containsKey("apple");

        // contains value
        map.containsValue(50.2);

        System.out.println(map.containsValue(50.2));
        System.out.println(map.containsKey("apple"));
        System.out.println( map.get("apple"));
        System.out.println(map);

        System.out.println(map.size());

        if(map.containsKey("pie")){
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Key not found.");
        }

        for(String key: map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
