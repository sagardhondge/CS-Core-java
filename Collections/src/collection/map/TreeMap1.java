package collection.map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm1 = new TreeMap();
        tm1.put(202, 'm');
        tm1.put(101, 'x');
        tm1.put(303, 'a');
        System.out.println(tm1);
        tm1.put(101, "Cyber");   // replaces value of key 101
        System.out.println(tm1);

        // tm1.put(null, 20.5f);  // Invalid
    }
}

