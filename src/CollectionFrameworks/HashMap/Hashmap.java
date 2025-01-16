package CollectionFrameworks.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    // Hash map: Key: Value pairs
    // Key is always unique
    // Value: can have same values
    // Unordered maps
    public static void main(String[] args) {
        // HashMap<Key,Value> nameOfHashmap=new HashMap<>();
        HashMap<String, Integer> map =new HashMap<>();
        // insert
        map.put("a",10);
        map.put("b",20);


        // print
        System.out.println("Map1: "+map);


        // update
        map.put("b",100);
        System.out.println("Map2: "+map);


        // search or lookup
        if(map.containsKey("a")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is absent");
        }

        // get
        System.out.println("Value of a: "+map.get("a")); // key exist
        System.out.println("Value of c: "+map.get("c")); // doesn't exit

        // iteration
        for(Map.Entry<String, Integer> element : map.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }
    }
}

